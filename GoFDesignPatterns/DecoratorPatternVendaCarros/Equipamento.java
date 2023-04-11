// Padrão Decorator - Classe Decorator
public abstract class Equipamento extends Carro {
    
  protected Carro carro;
    
  public abstract String getDescricao();
    
  public abstract double getPreco();

}