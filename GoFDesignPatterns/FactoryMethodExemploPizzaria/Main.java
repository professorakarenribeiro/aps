class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Pizzaria f01 = new PizzariaConvencional();
    Pizzaria f02 = new PizzariaFornoLenha();

    Pizza p01 = f01.criarPizza(true);
    p01.assar();

    p01 = f02.criarPizza(true);
    p01.assar();
  }
}