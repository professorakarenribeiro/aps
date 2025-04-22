// Implementação concreta da fábrica de pizzas
public class PizzariaFornoLenha extends Pizzaria {
  @Override
  protected Pizza criarPizza(boolean bordaRecheada) {
    Pizza pizza = null;
    if (bordaRecheada == true) {
      pizza = new PizzaComBorda();
    } else {
      pizza = new PizzaSemBorda();
    }
    System.out.println(" Pizza criada com sucesso para assar em forno a lenha.");
    return pizza;
  }

}