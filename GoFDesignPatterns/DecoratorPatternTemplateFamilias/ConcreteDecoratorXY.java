public class ConcreteDecoratorXY extends DecoratorX {
	public ConcreteDecoratorXY(Component component) {
		this.component = component;
	}

	public void operation() {
		component.operation();
    System.out.println(" + Decoração Y ");
	}
  
}