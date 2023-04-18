class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Cha cha = new Cha();
    Cafe cafe = new Cafe();

    cha.prepararReceita();
    cafe.prepararReceita();

    Bebida bebida;
    Bebida[] pedidos = {new Cafe(), new Cha(), new Cha()};
    
    for (int i=0; i<pedidos.length; i++) {
      bebida = pedidos[i];
      bebida.prepararReceita();
    }
  }
}