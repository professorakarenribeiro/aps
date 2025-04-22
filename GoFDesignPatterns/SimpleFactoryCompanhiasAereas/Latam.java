public class Latam implements CompanhiaAerea {
    @Override
    public void reservarVoo(String origem, String destino) {
        System.out.println("LATAM: voo reservado de " + origem + " para " + destino + ".");
    }
}
