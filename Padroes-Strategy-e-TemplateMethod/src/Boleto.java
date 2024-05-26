package src;

class Boleto extends Pagamento {
    @Override
    protected void realizarChecagens() {
        System.out.println("Checando chave Boleto do destinatário.");
        System.out.println("Realizando verificações de segurança.");
    }

    @Override
    protected double calcularValorFinal(double valor) {
        double valorFinal = valor * 0.95;
        System.out.println("Realizando pagamento via Boleto. Valor da compra = " + valorFinal);
        System.out.println("Realizando atualização do saldo da conta.");
        return valorFinal;
    }
}
