// Passo 7: Testar a funcionalidade da classe com diferentes estratégias, verificando se a troca da estratégia em tempo de execução está funcionando corretamente.

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.setBehavior(new ConcreteStrategySomar());
        System.out.println(calculadora.behavior(5, 3)); // imprime 8
        
        calculadora.setBehavior(new ConcreteStrategySubtrair());
        System.out.println(calculadora.behavior(5, 3)); // imprime 2
    }
}
