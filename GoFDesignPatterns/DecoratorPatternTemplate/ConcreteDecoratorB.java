public class ConcreteDecoratorB extends Decorator {
	public ConcreteDecoratorB(Component component) {
		this.component = component;
	}

	public void operation() {
		component.operation();
    System.out.println(" + Decoração B ");
	}
  
}