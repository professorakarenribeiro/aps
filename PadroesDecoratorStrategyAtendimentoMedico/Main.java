import java.math.BigDecimal;
// Classe Main para teste do sistema de saúde utilizando os padrões Strategy e Decorator
public class Main {
    public static void main(String[] args) {

        // Criando um atendimento médico base com valor inicial de 350
        AtendimentoMedico consulta = new AtendimentoMedico("Consulta médica", new BigDecimal("350"));

        // Definindo a estratégia de cobrança como particular (sem desconto)
        consulta.definirEstrategiaCobranca(new CobrancaParticular());
        // Exibindo a descrição e o custo da consulta
        System.out.println(consulta.getDescricao() + " - Custo: " + consulta.calcularCusto());

        // Definindo a estratégia de cobrança como SUS (gratuita)
        consulta.definirEstrategiaCobranca(new CobrancaSUS());
        // Exibindo a descrição e o custo da consulta
        System.out.println(consulta.getDescricao() + " - Custo: " + consulta.calcularCusto());

        // Criando um novo atendimento decorado (consulta com atendimento com especialista 40% mais cara)
        AtendimentoMedico consultaConvenio = new AtendimentoEspecialista(consulta);
        // Exibindo a descrição e o custo final do atendimento decorado
        System.out.println(consultaConvenio.getDescricao() + " - Custo: " + consultaConvenio.calcularCusto());

        // após aplicada a decoração, a estratégia não pode mais ser modificada pois a referência é perdida
    }
}