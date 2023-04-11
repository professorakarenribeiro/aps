// Padrão Decorator - Classe Component
public abstract class Carro {
  
  protected String descricao = "";
  
  protected double preco = 0;
  
  public abstract String getDescricao();
    
  public abstract double getPreco();
}