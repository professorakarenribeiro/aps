public class PatoSelvagem extends Pato {
  public PatoSelvagem() {
    comportamentoVoar = new PodeVoar();
    comportamentoGrasnar = new Quack();
  }

  public void aparencia() {
    System.out.println("Sou um pato selvagem marrom.");
  }
}