public class ConcreteDecoratorXZ extends DecoratorX {
	public ConcreteDecoratorXZ(Component component) {
		this.component = component;
	}

	public void operation() {
		component.operation();
    System.out.println(" + Decoração Z ");
	}
  
}