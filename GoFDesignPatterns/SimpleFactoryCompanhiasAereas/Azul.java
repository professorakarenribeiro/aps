public class Azul implements CompanhiaAerea {
    @Override
    public void reservarVoo(String origem, String destino) {
        System.out.println("Azul: reserva realizada com sucesso de " + origem + " para " + destino + ".");
    }
}
