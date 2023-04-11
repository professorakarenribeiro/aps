class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    // Criando o componente base
        Component component = new ConcreteComponent();
        
        // Decorando o componente com a funcionalidade A
        component = new ConcreteDecoratorA(component);
        
        // Decorando o componente com a funcionalidade B
        component = new ConcreteDecoratorB(component);
        
        // Executando a operação com as funcionalidades A e B
        component.operation();
        
        // Definindo a estratégia A
        Strategy strategy = new ConcreteStrategyA();
        
        // Utilizando a estratégia A
        strategy.execute();
        
        // Definindo a estratégia B
        strategy = new ConcreteStrategyB();
        
        // Utilizando a estratégia B
        strategy.execute();
        
        component.setStrategy(strategy);
        component.execute();
  }
}