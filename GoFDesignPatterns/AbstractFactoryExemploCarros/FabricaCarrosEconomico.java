class FabricaCarrosEconomico extends FabricaCarros {
  @Override
  public Motor criarMotor() {
    return new MotorEconomico();
  }

  @Override
  public Pneu criarPneu() {
    return new PneuEconomico();
  }
}