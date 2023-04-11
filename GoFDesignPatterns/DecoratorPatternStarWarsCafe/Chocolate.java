public class Chocolate extends Adicional {
	public Chocolate(Cafe cafe) {
		this.cafe = cafe;
	}
 
	public String getDescricao() {
		return cafe.getDescricao() + ", Adicional de Chocolate";
	}
 
	public double calcularPreco() {
		return 3.0 + cafe.calcularPreco();
	}
}