public abstract class Bebida {
  final void prepararReceita() {
  	ferverAgua();
  	preparar();
  	servir();
  	adicionarComplementos();
  }
    
	abstract void preparar();
	
	abstract void adicionarComplementos();
	
	public void ferverAgua() {
    System.out.println("Fervendo água...");
  }
  public void servir() {
    System.out.println("Servindo em um copo...");
  }
}