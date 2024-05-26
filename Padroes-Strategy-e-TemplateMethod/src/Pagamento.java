package src;

abstract class Pagamento implements FormaDePagamento {

    private FormaDePagamento formaDePagamento;
    public void setFormaDePagamento(FormaDePagamento formaDePagamento){
        this.formaDePagamento = formaDePagamento;
    }
    public final double realizarPagamento(double valor) {
        realizarChecagens();
        double valorFinal = calcularValorFinal(valor);
        notificarConclusao();
        return valorFinal;
    }
    protected abstract void realizarChecagens();

    protected abstract double calcularValorFinal(double valor);

    protected void notificarConclusao() {
        System.out.println("Notifica compra concluída.");
    }
}
