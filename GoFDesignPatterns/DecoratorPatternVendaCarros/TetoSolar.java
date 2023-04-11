// Padrão Decorator - Classe ConcreteDecorator
public class TetoSolar extends Equipamento {
    
  public TetoSolar(Carro carro) {
    this.carro = carro;
  }
  
  public String getDescricao() {
    return carro.getDescricao() + ", Teto Solar";
  }
    
  public double getPreco() {
    return carro.getPreco() + 15000.0;
  }
}