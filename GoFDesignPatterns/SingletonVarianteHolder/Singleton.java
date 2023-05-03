public class Singleton {
  private Singleton() {
    // construtor privado para evitar que outras classes instanciem essa classe
  }

  private static class SingletonHolder {
    private static final Singleton INSTANCE = new Singleton();
  }

  public static Singleton getInstance() {
    return SingletonHolder.INSTANCE;
  }
}