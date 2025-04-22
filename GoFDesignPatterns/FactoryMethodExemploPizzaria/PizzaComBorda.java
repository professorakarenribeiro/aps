class PizzaComBorda implements Pizza {
  @Override
  public void preparar() {
    System.out.println("Preparando Pizza com Borda Recheada.");
  }

  @Override
  public void assar() {
    System.out.println("Assando Pizza com Borda Recheada.");
  }

  @Override
  public void embalar() {
    System.out.println("Embalando Pizza com Borda Recheada.");
  }
}
