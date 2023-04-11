public class ConcreteDecoratorA extends Decorator {
	public ConcreteDecoratorA(Component component) {
		this.component = component;
	}

	public void operation() {
		component.operation();
    System.out.println(" + Decoração A ");
	}
  
}