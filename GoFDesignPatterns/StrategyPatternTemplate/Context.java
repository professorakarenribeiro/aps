public abstract class Context {
  Strategy strategy;

  public void setBehavior(Strategy st) {
    strategy = st;
  }

  public void behavior() {
    strategy.behavior();
  }

}