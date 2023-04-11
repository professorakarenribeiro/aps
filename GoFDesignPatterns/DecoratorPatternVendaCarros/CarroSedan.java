// Padrão Decorator - Classe ConcreteComponent
public class CarroSedan extends Carro {
  
  public String getDescricao() {
    return descricao + "Carro Sedan";
  }
    
  public double getPreco() {
    return preco + 50000.00;
  }
}