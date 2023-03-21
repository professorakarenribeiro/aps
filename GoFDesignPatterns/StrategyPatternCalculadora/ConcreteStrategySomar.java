// Passo 3: Criar várias classes que implementam essa interface com diferentes estratégias.
// Implementação de estratégia que realiza a operação de adição
class ConcreteStrategySomar implements StrategyOperacao {
  public int behavior(int a, int b) {
    return a + b;
  }
}