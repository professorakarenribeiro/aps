public class ConcreteFactoryY extends AbstractFactory {

  public AbstractProductA createProductA() {
    AbstractProductA product = new ConcreteProductAY();

    System.out.println("Produto A criado com sucesso via método Y");
    return product;
  }

  public AbstractProductB createProductB() {
    AbstractProductB product = new ConcreteProductBY();

    System.out.println("Produto B criado com sucesso via método Y");
    return product;
  }
}