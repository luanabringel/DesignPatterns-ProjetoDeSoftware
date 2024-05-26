package src;

class Credito extends Pagamento {
    @Override
    protected void realizarChecagens() {
        System.out.println("Checando limite de crédito do usuário");
        System.out.println("Realizando verificações de segurança");
    }

    @Override
    protected double calcularValorFinal(double valor) {
        double valorFinal = valor * 1.1;
        System.out.println("Realizando pagamento via cartão de crédito. Valor da compra = " + valorFinal);
        System.out.println("Realizando atualização do limite de crédito.");
        return valorFinal;
    }
}