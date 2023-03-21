// Classe que utiliza diferentes estratégias
class Calculadora {
  // Passo 4: Adicionar um atributo à classe que utiliza a estratégia para armazenar uma referência à interface comum.
  private StrategyOperacao strategy;

  // Passo 5: Adicionar um método à classe que utiliza a estratégia para permitir a troca da estratégia em tempo de execução.
  public void setBehavior(StrategyOperacao strategy) {
    this.strategy = strategy;
  }

  // Passo 6: Adicionar na classe que utiliza a estratégia uma chamada ao método da interface comum.
  public int behavior(int a, int b) {
    return strategy.behavior(a, b);
  }
}
