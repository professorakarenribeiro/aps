import factories.RUFactory;
import factories.RUConvencionalFactory;
import factories.RUVegetarianoFactory;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        RUFactory ruConvencional = new RUConvencionalFactory();
        RUFactory ruVegetariano = new RUVegetarianoFactory();

        System.out.println("=== SIMULAÇÃO DE ESTUDANTES USANDO O RU ===");

        Estudante estudante1 = new Estudante("Ana");
        Estudante estudante2 = new Estudante("João");


        estudante1.realizarRefeicao(ruConvencional, TipoRefeicao.CAFE_DA_MANHA);
        estudante2.realizarRefeicao(ruVegetariano, TipoRefeicao.ALMOCO);
        estudante1.realizarRefeicao(ruVegetariano, TipoRefeicao.JANTAR);
    }
}