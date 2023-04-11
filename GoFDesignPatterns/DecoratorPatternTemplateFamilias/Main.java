class Main {
  public static void main(String[] args) {
    System.out.println("Padrão Decorator");

    Component component = new ConcreteComponentA();

    // Opção com dois tipos de decoradores diferentes    
    component = new ConcreteDecoratorB(component);
    component = new ConcreteDecoratorXZ(component);
    component = new ConcreteDecoratorB(component);

    component.operation();

    // Opção com lista utilizando polimorfismo
    int i = 0;
    Component componentes[];
    componentes = new Component[3];
    
    componentes[0] = new ConcreteComponentA();

    componentes[1] = new ConcreteComponentB();
    componentes[1] = new ConcreteDecoratorA(componentes[1]);
    componentes[1] = new ConcreteDecoratorXY(componentes[1]);

    componentes[2] = new ConcreteComponentA();
    componentes[2] = new ConcreteDecoratorXZ(componentes[2]);

    for(i=0;i<componentes.length; i++){
    
      Component comp = componentes[i];
      
      comp.operation();
    }
  
  }
}