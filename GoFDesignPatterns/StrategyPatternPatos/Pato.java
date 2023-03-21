public abstract class Pato {
  ComportamentoVoar comportamentoVoar;
  ComportamentoGrasnar comportamentoGrasnar;

  public void setComportamentoVoar(ComportamentoVoar cv) {
    comportamentoVoar = cv;
  }

  public void setComportamentoGrasnar(ComportamentoGrasnar cg) {
    comportamentoGrasnar = cg;
  }

  abstract void aparencia();

  public void voar() {
    comportamentoVoar.voar();
  }

  public void grasnar() {
    comportamentoGrasnar.grasnar();
  }

  public void nadar() {
    System.out.println("Nadando, nadando...");
  }
}