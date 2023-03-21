class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    ContextVariantA c1 = new ContextVariantA();
    c1.behavior();

    c1.setBehavior(new ConcreteStrategyA()); // trocando a estratégia em tempo de execução
    c1.behavior();

    ContextVariantB c2 = new ContextVariantB();
    c2.behavior();
  }
}