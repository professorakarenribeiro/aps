package model;

import java.util.ArrayList;
import java.sql.*;

public class EstudanteDAOImpl implements EstudanteDAO {

    public Connection conexao;

    public EstudanteDAOImpl(Connection conexao) {
        this.conexao = conexao;
    }

    @Override
    public void inserir(Estudante estudante) {
        // Lógica para inserir um estudante no banco de dados
        String inserirRegistro = "INSERT INTO estudantes (estudanteNome, estudanteRGA) values (?,?)";

        try {
            PreparedStatement statementInserirRegistro = this.conexao.prepareStatement(inserirRegistro);

            statementInserirRegistro.setString(1, estudante.getNome());
            statementInserirRegistro.setString(2, estudante.getRGA());
            statementInserirRegistro.executeUpdate();

            System.out.println("Novo registro de estudante inserido com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<Estudante> buscarTodos() {
        // Lógica para buscar todos os estudantes do banco de dados
        String mostrarTodosRegistros = "SELECT * FROM estudantes";
        ArrayList<Estudante> listaEstudantes = new ArrayList<Estudante>();
        ;
        try {
            Statement statementTodosRegistros = this.conexao.createStatement();
            ResultSet registros = statementTodosRegistros.executeQuery(mostrarTodosRegistros);

            while (registros.next()) {
                Estudante est = new Estudante(registros.getString("estudanteNome"),
                        registros.getString("estudanteRGA"));
                listaEstudantes.add(est);
            }

            System.out.println("Lista de estudantes retornada com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaEstudantes;
    }

    @Override
    public Estudante buscarPorRGA(String RGA) {
        // Lógica para excluir um estudante do banco de dados por RGA
        String buscarRegistro = "SELECT * FROM estudantes WHERE estudanteRGA=" + RGA;
        Estudante est = null;

        try {
            Statement statementBuscarRegistro = this.conexao.createStatement();
            ResultSet registros = statementBuscarRegistro.executeQuery(buscarRegistro);

            if (registros.next()) {
                est = new Estudante(registros.getString("estudanteNome"), registros.getString("estudanteRGA"));
                System.out.println("Registro de estudante encontrado com sucesso!");
            } else {
                System.out.println("Estudante não encontrado.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return est;
    }

    @Override
    public void excluir(String RGA) {
        // Lógica para excluir um estudante do banco de dados por RGA
        Estudante est = this.buscarPorRGA(RGA);

        if (est != null) {
            System.out.println("Excluindo estudante...");
            String excluirRegistro = "DELETE FROM estudantes WHERE estudanteRGA=" + RGA;
            try {
                PreparedStatement statementExcluirRegistro = this.conexao.prepareStatement(excluirRegistro);
                statementExcluirRegistro.executeUpdate();
                System.out.println("Estudante excluído com sucesso!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void atualizar(Estudante estudante, String nome) {
        // Lógica para atualizar um estudante no banco de dados
        String atualizarRegistro = "UPDATE estudantes SET estudanteNome=? WHERE estudanteRGA=?";
        try {
            PreparedStatement statementAtualizarRegistro = this.conexao.prepareStatement(atualizarRegistro);
            statementAtualizarRegistro.setString(1, nome);
            statementAtualizarRegistro.setString(2, estudante.getRGA());
            statementAtualizarRegistro.executeUpdate();
            System.out.println("Estudante atualizado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
