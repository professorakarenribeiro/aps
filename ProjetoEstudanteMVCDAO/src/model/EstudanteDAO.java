package model;

import java.util.ArrayList;

public interface EstudanteDAO {
    void inserir(Estudante estudante);

    Estudante buscarPorRGA(String RGA);

    ArrayList<Estudante> buscarTodos();

    void excluir(String RGA);

    void atualizar(Estudante estudante, String nome);
}