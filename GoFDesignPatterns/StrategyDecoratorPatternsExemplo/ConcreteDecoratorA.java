// Implementação concreta do decorator que adiciona funcionalidade A
class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }
    
    public void operation() {
        super.operation();
        addFunctionalityA();
    }
    
    private void addFunctionalityA() {
        System.out.println("Adicionando funcionalidade A.");
    }
}