class Main { // Aqui a classe Main representa a classe Cliente
  public static void main(String[] args) {
    System.out.println("Hello world!");

    ProductSimpleFactory factory = new ProductSimpleFactory(); // Cria uma instância da fábrica

    // Pede para a fábrica criar uma instância de produto
    Product p01 = factory.createProduct("A");

    // Usando o produto criado normalmente...
    System.out.println(p01.getName());
    p01.operation();

    Product p02 = factory.createProduct("B");
    System.out.println(p02.getName());
    p02.operation();

  }
}