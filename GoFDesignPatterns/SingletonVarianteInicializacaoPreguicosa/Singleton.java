public class Singleton {
  private static volatile Singleton instance;

  private Singleton() {
    // construtor privado para evitar que outras classes instanciem essa classe
  }

  public static Singleton getInstance() {
    if (instance == null) {
      synchronized (Singleton.class) {
        if (instance == null) {
          instance = new Singleton();
        }
      }
    }
    return instance;
  }
}