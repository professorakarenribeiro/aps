import java.math.BigDecimal;
// Implementações do padrão Strategy
class CobrancaConvenio implements EstrategiaCobranca {
    @Override
    public BigDecimal calcularCusto(BigDecimal valorBase) {
        return valorBase.multiply(new BigDecimal("0.8")); // 20% de desconto
    }
}