// Esta é uma ConcreteClass do padrão Template Method.

public class ExameUrina extends ExameSaude {

  @Override
  protected void prepararPaciente() {
    System.out.println("Apresenta as instruções de preparo para o exame de urina.");
  }

  @Override
  protected void coletarAmostras() {
    System.out.println("Coletando amostra de urina...");
  }

  @Override
  protected void processarAmostras() {
    System.out.println("Processando amostra de urina...");
  }

}
