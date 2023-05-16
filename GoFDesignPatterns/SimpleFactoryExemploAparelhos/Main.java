class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    // A fábrica com método static pode ser referenciada diretamente
    AparelhoMedico monitor = AparelhoMedicoFabrica.criarAparelhoMedico("monitorCardiaco");
    AparelhoMedico termometro = AparelhoMedicoFabrica.criarAparelhoMedico("termometro");

    // Utilizando os dispositivos médicos
    monitor.monitorarParametro();
    termometro.monitorarParametro();
  }
}