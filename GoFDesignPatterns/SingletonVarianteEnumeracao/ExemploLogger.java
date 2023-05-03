import java.util.ArrayList;

public enum ExemploLogger {
  INSTANCE;

  private ArrayList<String> logMessages;

  private ExemploLogger() {
    this.logMessages = new ArrayList<String>();
  }

  public void log(String message) {
    logMessages.add(message);
  }

  public void printLogs() {
    for (String message : logMessages) {
      System.out.println(message);
    }
  }
}