// Passo 2: Criar uma interface comum que represente a estratégia.
// Interface comum para as diferentes estratégias de operações matemáticas
interface StrategyOperacao {
  int behavior(int a, int b);
}