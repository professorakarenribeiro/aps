public class ContextVariantA extends Context {
  public ContextVariantA() {
    /***
     * strategy = new ConcreteStrategyA(); OU
     * strategy = new ConcreteStrategyB(); OU
     * strategy = new ConcreteStrategyN();
     ***/

    /*
     * O objeto de estratégia pode ser utilizado em qualquer local da
     * ContextVariant. Não precisa ser no método construtor, como neste exemplo.
     */
    strategy = new ConcreteStrategyB();
  }

}