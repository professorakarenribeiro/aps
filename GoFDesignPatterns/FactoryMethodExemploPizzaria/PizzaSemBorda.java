class PizzaSemBorda implements Pizza {
  @Override
  public void preparar() {
    System.out.println("Preparando Pizza SEM Borda Recheada.");
  }

  @Override
  public void assar() {
    System.out.println("Assando Pizza SEM Borda Recheada.");
  }

  @Override
  public void embalar() {
    System.out.println("Embalando Pizza SEM Borda Recheada.");
  }
}
