package view;

import model.*;

import java.util.ArrayList;
import java.util.Scanner;

public class EstudanteView {

    Scanner scanner;

    public EstudanteView() {
        this.scanner = new Scanner(System.in);
    }

    public void mostrarEstudantes(ArrayList<Estudante> listaEstudantes) {
        System.out.println("------ESTUDANTES DO SISTEMA:------");

        for (int i = 0; i < listaEstudantes.size(); i++) {
            Estudante est = listaEstudantes.get(i);
            System.out.println(est.getRGA() + ": " + est.getNome());

        }
    }

    public void mostrarEstudante(Estudante estudante) {
        System.out.println(estudante.getRGA() + ": " + estudante.getNome());
    }

    public String getNomeEstudante() {
        System.out.println("Informe o nome completo do(a) estudante:");
        String nome = scanner.nextLine();
        return nome;
    }

    public String getRGAEstudante() {
        System.out.println("Informe o RGA do(a) estudante:");
        String RGA = scanner.nextLine();
        return RGA;
    }

    public void inserirEstudante() {
        System.out.println("------INSERIR ESTUDANTE NO SISTEMA:------");
    }

    public void pesquisarEstudante() {
        System.out.println("------PESQUISAR ESTUDANTE NO SISTEMA:------");
    }

    public void excluirEstudante() {
        System.out.println("------EXCLUIR ESTUDANTE DO SISTEMA:------");
    }

    public void atualizarEstudante() {
        System.out.println("------ATUALIZAR ESTUDANTE NO SISTEMA:------");
    }

    public void confirmarExclusaoEstudante(String RGA) {
        System.out.println("Estudante " + RGA + " excluído com sucesso!");
    }

    public int exibirMenu(){
        System.out.println("------MENU SISTEMA DE ESTUDANTES:------");
        System.out.println("--Escolha uma opção:--");
        System.out.println("1 - Mostrar Estudantes;");
        System.out.println("2 - Inserir Estudante;");
        System.out.println("3 - Atualizar Estudante;");
        System.out.println("4 - Excluir Estudante;");
        System.out.println("5 - Pesquisar Estudante;");
        System.out.println("0 - Encerrar sistema.");
        int opcao = scanner.nextInt();
        return opcao;
    }

}
