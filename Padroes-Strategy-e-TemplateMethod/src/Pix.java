package src;

class Pix extends Pagamento {
    @Override
    protected void realizarChecagens() {
        System.out.println("Checando chave PIX do destinatário.");
        System.out.println("Realizando verificações de segurança.");
    }

    @Override
    protected double calcularValorFinal(double valor) {
        double valorFinal = valor * 0.9;
        System.out.println("Realizando pagamento via PIX. Valor da compra = " + valorFinal);
        System.out.println("Realizando atualização do saldo da conta.");
        return valorFinal;
    }
}
