public abstract class FabricaCarros {

  Motor motor;
  Pneu pneu;
  
  public void montarCarro() {
    this.motor = this.criarMotor();
    this.motor.fabricar();
    this.pneu = this.criarPneu();
    this.pneu.fabricar();

    System.out.println("Carro montado!");
  }

  public abstract Motor criarMotor();

  public abstract Pneu criarPneu();
}