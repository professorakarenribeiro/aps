public class AparelhoMedicoFabrica {
  public static AparelhoMedico criarAparelhoMedico(String tipo) {
    if (tipo.equalsIgnoreCase("monitorCardiaco")) {
      return new MonitorCardiaco();
    } else if (tipo.equalsIgnoreCase("termometro")) {
      return new Termometro();
    } else {
      throw new IllegalArgumentException("Tipo de dispositivo médico inválido.");
    }
  }
}