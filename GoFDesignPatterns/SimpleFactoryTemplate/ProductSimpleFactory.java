public class ProductSimpleFactory {

  public Product createProduct(String type) {
    Product product = null;

    if (type.equals("A")) {
      product = new ConcreteProductA();
    } else if (type.equals("B")) {
      product = new ConcreteProductB();
    } else {
      System.out.println("Tente novamente.");
    }
    
    return product;
  }
}