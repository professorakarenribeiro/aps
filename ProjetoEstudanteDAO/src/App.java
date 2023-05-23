import java.sql.*; // importa a biblioteca SQL
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Meu projeto JDBC!");

        // Criando objetos de teste...
        Estudante e01 = new Estudante("João Silva", "202311310001");
        Estudante e02 = new Estudante("Maria Ribeiro", "202311310002");

        // organizar seus dados de conexão em strings é uma boa ideia!
        String mySQLURL = "jdbc:mysql://localhost:3306/BDalg3"; // informar o nome do banco no final da URL é opcional
        String usuario = "root";
        String senha = "123456";

        // realiza a conexão com o banco
        try (Connection conexao = DriverManager.getConnection(mySQLURL, usuario, senha)) {

            if (conexao != null) {
                System.out.println("Conectado com sucesso à instância MySQL!");

                // Testando o funcionamento da DAO...
                EstudanteDAOImpl estudanteDAO = new EstudanteDAOImpl(conexao);

                estudanteDAO.inserir(e01);
                estudanteDAO.inserir(e02);

                Estudante e03 = estudanteDAO.buscarPorRGA("202311310001");
                System.out.println(e03.getNome());

                estudanteDAO.excluir("202311310001");

                estudanteDAO.atualizar(e02, "Maria Rocha");

                ArrayList<Estudante> listaEstudantes = estudanteDAO.buscarTodos();
                for (int i = 0; i < listaEstudantes.size(); i++) {
                    Estudante est = listaEstudantes.get(i);
                    System.out.println(est.getRGA() + ": " + est.getNome());

                }

            }

            conexao.close(); // fecha a conexão com o banco - sempre fechar após o uso!

        } catch (SQLException ex) {
            System.out.println("Houve um problema com a conexão.");
            ex.printStackTrace();
        }
    }
}