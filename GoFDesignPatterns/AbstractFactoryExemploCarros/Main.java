class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    FabricaCarros f01 = new FabricaCarrosLuxo();
    FabricaCarros f02 = new FabricaCarrosEconomico();

    f01.montarCarro();
    f02.montarCarro();
  }
}