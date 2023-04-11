// Padrão Decorator - Classe ConcreteDecorator
public class RodasLigaLeve extends Equipamento {
    
  public RodasLigaLeve(Carro carro) {
    this.carro = carro;
  }
  
  public String getDescricao() {
    return carro.getDescricao() + ", Rodas de Liga Leve";
  }
    
  public double getPreco() {
    return carro.getPreco() + 2500.0;
  }
}