package controller;

import model.*;
import view.EstudanteView;

import java.sql.*;

import java.util.ArrayList;

public class EstudanteController {

    public Connection conexao;
    EstudanteDAOImpl estudanteModel;
    EstudanteView estudanteView;

    public EstudanteController(Connection conexao, EstudanteDAOImpl estudanteModel, EstudanteView estudanteView) {
        this.conexao = conexao;
        this.estudanteView = estudanteView;
        this.estudanteModel = new EstudanteDAOImpl(conexao);
        this.iniciarInterface();
    }

    public void iniciarInterface() {
        System.out.println("Iniciando o sistema...");
        int menu = this.estudanteView.exibirMenu();
        while (menu != 0) {
            switch (menu) {
                case 1:
                    this.mostrarEstudantes();
                case 2:
                    this.inserirEstudante();
                case 3:
                    this.atualizarEstudante();
                case 4:
                    this.excluirEstudantePorRGA();
                case 5:
                    this.pesquisarEstudantePorRGA();

            }
        }

    }

    public void mostrarEstudantes() {
        ArrayList<Estudante> listaEstudantes = this.estudanteModel.buscarTodos();
        this.estudanteView.mostrarEstudantes(listaEstudantes);
    }

    public void inserirEstudante() {
        this.estudanteView.inserirEstudante();
        Estudante est = new Estudante(this.estudanteView.getNomeEstudante(), this.estudanteView.getRGAEstudante());
        this.estudanteModel.inserir(est);
    }

    public void pesquisarEstudantePorRGA() {
        this.estudanteView.pesquisarEstudante();
        String RGA = this.estudanteView.getRGAEstudante();
        if (this.estudanteModel.buscarPorRGA(RGA) != null) {
            this.estudanteView.mostrarEstudante(this.estudanteModel.buscarPorRGA(RGA));
        }
    }

    public void excluirEstudantePorRGA() {
        this.estudanteView.excluirEstudante();
        String RGA = this.estudanteView.getRGAEstudante();
        if (this.estudanteModel.buscarPorRGA(RGA) != null) {
            this.estudanteModel.excluir(RGA);
            this.estudanteView.confirmarExclusaoEstudante(RGA);
        }

    }

    public void atualizarEstudante() {
        this.estudanteView.atualizarEstudante();
        String RGA = this.estudanteView.getRGAEstudante();
        if (this.estudanteModel.buscarPorRGA(RGA) != null) {
            String nomeEstudante = this.estudanteView.getNomeEstudante();
            this.estudanteModel.atualizar(this.estudanteModel.buscarPorRGA(RGA), nomeEstudante);
        }

    }

}
