class Main {
  public static void main(String[] args) {
    System.out.println("Padrão Decorator");

    Component component = new ConcreteComponentA();

    component = new ConcreteDecoratorB(component);
    component = new ConcreteDecoratorA(component);
    component = new ConcreteDecoratorB(component);

    component.operation();
  }
}