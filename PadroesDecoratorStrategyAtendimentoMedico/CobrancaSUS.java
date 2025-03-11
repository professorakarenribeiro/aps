import java.math.BigDecimal;
// Implementações do padrão Strategy
class CobrancaSUS implements EstrategiaCobranca {
    @Override
    public BigDecimal calcularCusto(BigDecimal valorBase) {
        return BigDecimal.ZERO; // Gratuito
    }
}