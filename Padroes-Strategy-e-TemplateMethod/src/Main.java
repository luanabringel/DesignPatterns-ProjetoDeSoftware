package src;

public class Main {
    public static void main(String[] args) {

        Pagamento pagamento = new Pagamento();

        FormaDePagamento debito = new Debito();
        pagamento.setFormaDePagamento(debito);
        pagamento.realizarPagamento(500);
        System.out.println("============================================");

        FormaDePagamento credito = new Credito();
        pagamento.setFormaDePagamento(credito);
        pagamento.realizarPagamento(1122);
        System.out.println("============================================");

        FormaDePagamento pix = new Pix();
        pagamento.setFormaDePagamento(pix);
        pagamento.realizarPagamento(600);
        System.out.println("============================================");

        FormaDePagamento boleto = new Boleto();
        pagamento.setFormaDePagamento(boleto);
        pagamento.realizarPagamento(160);
        System.out.println("============================================");
    }
}