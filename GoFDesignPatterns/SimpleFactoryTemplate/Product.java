public abstract class Product {
  String name;

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void operation() {
    System.out.println("Executando método da instância de " + name);
  }
}