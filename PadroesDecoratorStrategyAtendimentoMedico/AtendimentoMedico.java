import java.math.BigDecimal;
// Classe Component do padrão Decorator e também Context do padrão Strategy
class AtendimentoMedico {
    protected String descricao;
    protected BigDecimal valorBase;
    private EstrategiaCobranca estrategiaCobranca;

    public AtendimentoMedico(String descricao, BigDecimal valorBase) {
        this.descricao = descricao;
        this.valorBase = valorBase;
    }

    public void definirEstrategiaCobranca(EstrategiaCobranca estrategiaCobranca) {
        this.estrategiaCobranca = estrategiaCobranca;
    }

    public BigDecimal calcularCusto() {
        return estrategiaCobranca != null ? estrategiaCobranca.calcularCusto(valorBase) : valorBase;
    }

    public String getDescricao() {
        return descricao;
    }
}