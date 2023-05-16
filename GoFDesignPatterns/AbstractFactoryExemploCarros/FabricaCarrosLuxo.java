class FabricaCarrosLuxo extends FabricaCarros {
  @Override
  public Motor criarMotor() {
    return new MotorLuxo();
  }

  @Override
  public Pneu criarPneu() {
    return new PneuLuxo();
  }
}