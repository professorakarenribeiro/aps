public class Main {
    public static void main(String[] args) {
        CompanhiaAerea c1 = CompanhiaAereaFactory.criarCompanhia("latam");
        c1.reservarVoo("São Paulo", "Fortaleza");

        CompanhiaAerea c2 = CompanhiaAereaFactory.criarCompanhia("gol");
        c2.reservarVoo("Brasília", "Salvador");

        CompanhiaAerea c3 = CompanhiaAereaFactory.criarCompanhia("azul");
        c3.reservarVoo("Porto Alegre", "Curitiba");

        try {
            CompanhiaAerea c4 = CompanhiaAereaFactory.criarCompanhia("avianca");
            c4.reservarVoo("Rio", "Buenos Aires");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
