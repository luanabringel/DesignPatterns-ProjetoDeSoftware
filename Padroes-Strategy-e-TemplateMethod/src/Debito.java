package src;

class Debito extends Pagamento {
    @Override
    protected void realizarChecagens() {
        System.out.println("Checando saldo da conta do usuário.");
        System.out.println("Realizando verificações de segurança.");
    }

    @Override
    protected double calcularValorFinal(double valor) {
        System.out.println("Realizando pagamento via cartão de débito. Valor da compra = " + valor);
        System.out.println("Realizando atualização do saldo da conta.");
        return valor;
    }
}
