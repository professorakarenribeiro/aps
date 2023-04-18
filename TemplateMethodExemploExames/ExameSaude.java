// Esta é a AbstractClass do padrão Template Method.

public abstract class ExameSaude {

  // Método template
  public final void realizarExame() {
    prepararPaciente(); // Comportamento variável
    coletarAmostras(); // Comportamento variável
    processarAmostras(); // Comportamento variável
    emitirResultado(); // Comportamento comum
  }

  protected abstract void prepararPaciente(); // Método gancho

  protected abstract void coletarAmostras(); // Método gancho

  protected abstract void processarAmostras(); // Método gancho

  private void emitirResultado() {
    System.out.println("Apresentando os dados do resultado do exame...");
  }
}