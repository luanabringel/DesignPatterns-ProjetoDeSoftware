package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import src.Pagamento;

public class PagamentoTests {
    @Test
    public void testPagamentoDebito() {
        Pagamento pagamento = new Pagamento();
        FormaDePagamento debito = new Debito();
        pagamento.setMetodoPagamento(debito);

        double valorCompra = 500;
        double valorEsperado = valorCompra;
        double valorRetornado = pagamento.realizarPagamento(valorCompra);

        assertEquals(valorEsperado, valorRetornado, 0.001);
    }

    @Test
    public void testPagamentoCredito() {
        Pagamento pagamento = new Pagamento();
        FormaDePagamento credito = new Credito();
        pagamento.setMetodoPagamento(credito);

        double valorCompra = 1122;
        double valorEsperado = valorCompra * 1.1;
        double valorRetornado = pagamento.realizarPagamento(valorCompra);

        assertEquals(valorEsperado, valorRetornado, 0.001);
    }

    @Test
    public void testPagamentoPix() {
        Pagamento pagamento = new Pagamento();
        FormaDePagamento pix = new Pix();
        pagamento.setMetodoPagamento(pix);

        double valorCompra = 600;
        double valorEsperado = valorCompra * 0.9;
        double valorRetornado = pagamento.realizarPagamento(valorCompra);

        assertEquals(valorEsperado, valorRetornado, 0.001);
    }

    @Test
    public void testPagamentoBoleto() {
        Pagamento pagamento = new Pagamento();
        FormaDePagamento boleto = new Boleto();
        pagamento.setMetodoPagamento(boleto);

        double valorCompra = 160;
        double valorEsperado = valorCompra * 0.95;
        double valorRetornado = pagamento.realizarPagamento(valorCompra);

        assertEquals(valorEsperado, valorRetornado, 0.001);
    }
}
