// Implementação concreta do decorator que adiciona funcionalidade B
class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }
    
    public void operation() {
        super.operation();
        addFunctionalityB();
    }
    
    private void addFunctionalityB() {
        System.out.println("Adicionando funcionalidade B.");
    }
}
