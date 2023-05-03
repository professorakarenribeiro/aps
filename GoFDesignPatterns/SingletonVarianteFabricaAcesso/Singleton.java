public class Singleton {
  private static Singleton instance;

  private Singleton() {
    // construtor privado para evitar que outras classes instanciem essa classe
  }

  public static synchronized Singleton getInstance() {
    if (instance == null) {
      instance = new Singleton();
    }
    return instance;
  }
}