public class PatoBorracha extends Pato {
  public PatoBorracha() {
    comportamentoVoar = new NaoPodeVoar();
    comportamentoGrasnar = new Squeak();
  }

  public void aparencia() {
    System.out.println("Sou um pato de borracha amarelo.");
  }
}