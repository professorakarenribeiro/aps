import java.math.BigDecimal;

// Interface Strategy - Define o comportamento de cobrança
interface EstrategiaCobranca {
    BigDecimal calcularCusto(BigDecimal valorBase);
}