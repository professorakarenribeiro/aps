class Main { // Aqui a classe Main representa a classe Cliente
  public static void main(String[] args) {
    System.out.println("Hello world!");

    ConcreteFactoryX factoryX = new ConcreteFactoryX(); // cria fábrica de produtos na versão X

    ConcreteFactoryY factoryY = new ConcreteFactoryY(); // cria fábrica de produtos na versão Y

    // Pede para a fábrica X criar uma instância do produto A

    AbstractProductA productA = factoryX.createProductA();

    // Pede para a fábrica Y criar uma instância do produto B
    AbstractProductB productB = factoryY.createProductB();

    // Usando o produto criado normalmente...
    productA.operation();
    productB.operation();

    
  }
}