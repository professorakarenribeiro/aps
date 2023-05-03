public class Singleton {
  private static final Singleton instance = new Singleton();

  private Singleton() {
    // construtor privado para evitar que outras classes instanciem essa classe
  }

  public static Singleton getInstance() {
    return instance;
  }
}