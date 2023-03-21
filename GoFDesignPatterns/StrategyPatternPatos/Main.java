class Main {
  public static void main(String[] args) {
    // System.out.println("Hello world!");

    PatoSelvagem p1 = new PatoSelvagem();
    PatoBorracha p2 = new PatoBorracha();

    p1.aparencia();
    p1.voar();
    p1.grasnar();
    p1.nadar();

    p2.aparencia();
    p2.voar();
    p2.grasnar();
    p2.nadar();

    p2.setComportamentoGrasnar(new NaoGrasna());
    p2.grasnar();

    /*
     * EXERCÍCIOS:
     * 1- Crie a classe PatoDomestico com seus comportamentos adequados e depois
     * crie uma instância sua.
     * 2- Crie um novo tipo de Pato com os comportamentos que desejar.
     * 3- Crie um novo tipo de comportamento de voo e atribua este comportamento a
     * um dos tipos de pato em tempo de execução.
     */
  }
}