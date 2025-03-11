import java.math.BigDecimal;
// Implementações do padrão Strategy
class CobrancaParticular implements EstrategiaCobranca {
    @Override
    public BigDecimal calcularCusto(BigDecimal valorBase) {
        return valorBase;
    }
}