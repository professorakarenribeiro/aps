class Main { // Aqui a classe Main representa a classe Cliente
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Creator factory = new ConcreteCreatorX(); // define a uma forma de fabricar

    // Pede para a fábrica criar uma instância de produto
    Product p01 = factory.createProduct("A");

    // Usando o produto criado normalmente...
    System.out.println(p01.getName());
    p01.operation();

    // Alterando a forma de fabricar...
    factory = new ConcreteCreatorY();
    p01 = factory.createProduct("A");
    p01.operation();
  }
}