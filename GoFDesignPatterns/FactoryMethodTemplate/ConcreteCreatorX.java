public class ConcreteCreatorX extends Creator {

  public Product createProduct(String type) {
    Product product = null;

    if (type.equalsIgnoreCase("A")) {
      product = new ConcreteProductA();
    } else if (type.equalsIgnoreCase("B")) {
      product = new ConcreteProductB();
    } else {
      throw new IllegalArgumentException("Tente novamente");
    }

    System.out.println(product.getName() + " criado com sucesso via método fábrica X.");
    return product;
  }
}