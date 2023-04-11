public class Leite extends Adicional {
	public Leite(Cafe cafe) {
		this.cafe = cafe;
	}

	public String getDescricao() {
		return cafe.getDescricao() + ", Adicional de Leite";
	}

	public double calcularPreco() {
		return 2.0 + cafe.calcularPreco();
	}
}