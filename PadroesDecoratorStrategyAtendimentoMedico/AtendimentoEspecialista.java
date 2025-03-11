import java.math.BigDecimal;
// Implementações concretas do padrão Decorator
class AtendimentoEspecialista extends AtendimentoDecorator {
    public AtendimentoEspecialista(AtendimentoMedico atendimentoDecorado) {
        super(atendimentoDecorado);
        this.descricao = atendimentoDecorado.getDescricao() + " com Atendimento com Especialista";
    }

    @Override
    public BigDecimal calcularCusto() {
        //return super.calcularCusto().add(new BigDecimal("50")); // Adiciona custo extra
        return super.calcularCusto().multiply(new BigDecimal("1.4"));
    }
}