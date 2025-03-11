import java.math.BigDecimal;
// Classe Decorator - Extende AtendimentoMedico para adicionar funcionalidades extras
abstract class AtendimentoDecorator extends AtendimentoMedico {
    protected AtendimentoMedico atendimentoDecorado;

    public AtendimentoDecorator(AtendimentoMedico atendimentoDecorado) {
        super(atendimentoDecorado.getDescricao(), atendimentoDecorado.valorBase);
        this.atendimentoDecorado = atendimentoDecorado;
    }

    @Override
    public BigDecimal calcularCusto() {
        return atendimentoDecorado.calcularCusto();
    }
}