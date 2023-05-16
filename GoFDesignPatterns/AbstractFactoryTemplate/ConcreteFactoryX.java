public class ConcreteFactoryX extends AbstractFactory {

  public AbstractProductA createProductA() {
    AbstractProductA product = new ConcreteProductAX();

    System.out.println("Produto A criado com sucesso via método X");
    return product;
  }

  public AbstractProductB createProductB() {
    AbstractProductB product = new ConcreteProductBX();

    System.out.println("Produto B criado com sucesso via método X");
    return product;
  }
}