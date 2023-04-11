class Main {
  public static void main(String[] args) {
    System.out.println("PEDIDOS: ");

    Cafe cafe = new Expresso();
    System.out.println(cafe.getDescricao()
        + " R$" + cafe.calcularPreco());

    Cafe cafe2 = new Torrado();
    
    cafe2 = new Chocolate(cafe2);
    cafe2 = new Leite(cafe2);
    cafe2 = new Leite(cafe2);
    System.out.println(cafe2.getDescricao()
        + " R$" + cafe2.calcularPreco());

    Cafe cafe3 = new Tradicional();
    cafe3 = new Soja(cafe3);
    
    System.out.println(cafe3.getDescricao()
        + " R$" + cafe3.calcularPreco());
  }
}