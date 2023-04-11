public class Soja extends Adicional {
	public Soja(Cafe cafe) {
		this.cafe = cafe;
	}

	public String getDescricao() {
		return cafe.getDescricao() + ", Adicional de Leite de Soja";
	}

	public double calcularPreco() {
		return 2.50 + cafe.calcularPreco();
	}
}