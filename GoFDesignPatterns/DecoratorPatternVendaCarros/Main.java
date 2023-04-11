class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Carro carro = new CarroSedan();
    carro = new RodasLigaLeve(carro);
    carro = new TetoSolar(carro);
    System.out.println(carro.getDescricao() + ": " + carro.getPreco());
    // saída: Carro Sedan, Rodas de Liga Leve, Teto Solar: 28000.0

    // removendo a última decoração de carro
    Carro carroSemEquipamento = ((Equipamento)carro).carro;
    System.out.println(carroSemEquipamento.getDescricao() + ": " + carroSemEquipamento.getPreco());

  }
}