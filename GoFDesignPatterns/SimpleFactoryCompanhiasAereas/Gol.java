public class Gol implements CompanhiaAerea {
    @Override
    public void reservarVoo(String origem, String destino) {
        System.out.println("Gol Linhas Aéreas: sua viagem de " + origem + " para " + destino + " foi confirmada.");
    }
}
