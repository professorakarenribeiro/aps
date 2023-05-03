class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Singleton s = Singleton.INSTANCE;

    ExemploLogger.INSTANCE.log("Primeira mensagem de log");
    ExemploLogger.INSTANCE.log("Segunda mensagem de log");
    ExemploLogger.INSTANCE.printLogs();
  }
}