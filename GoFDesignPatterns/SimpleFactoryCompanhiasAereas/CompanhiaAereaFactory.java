public class CompanhiaAereaFactory {
    public static CompanhiaAerea criarCompanhia(String nome) {
        switch (nome.toLowerCase()) {
            case "latam":
                return new Latam();
            case "gol":
                return new Gol();
            case "azul":
                return new Azul();
            default:
                throw new IllegalArgumentException("Companhia aérea desconhecida: " + nome);
        }
    }
}
