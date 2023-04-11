public abstract class Cafe {
	String descricao = "Café desconhecido";
  
	public String getDescricao() {
		return descricao;
	}
 
	public abstract double calcularPreco();
}