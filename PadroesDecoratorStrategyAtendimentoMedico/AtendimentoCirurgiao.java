import java.math.BigDecimal;
// Implementações concretas do padrão Decorator
class AtendimentoCirurgiao extends AtendimentoDecorator {
    public AtendimentoCirurgiao(AtendimentoMedico atendimentoDecorado) {
        super(atendimentoDecorado);
        this.descricao = atendimentoDecorado.getDescricao() + " com Atendimento com Cirurgião";
    }

    @Override
    public BigDecimal calcularCusto() {
        return super.calcularCusto().multiply(new BigDecimal("2"));
    }
}