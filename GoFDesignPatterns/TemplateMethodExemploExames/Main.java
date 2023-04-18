/* Este é um exemplo de aplicação do padrão de projeto Template Method.
* Esta é a classe principal executável do projeto, que está funcionando como Cliente para as classes participantes do padrão. */

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    ExameSaude exameSangue = new ExameSangue();
    exameSangue.realizarExame();

    ExameSaude exameUrina = new ExameUrina();
    exameUrina.realizarExame();
  }
}