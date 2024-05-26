package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import src.Pagamento;

public class PagamentoTests {
    @Test
    public void testPagamentoDebito() {
        Pagamento pagamento = new Debito();
        double valorCompra = 500;
        double valorEsperado = valorCompra;
        double valorRetornado = pagamento.realizarPagamento(valorCompra);
        assertEquals(valorEsperado, valorRetornado, 0.001);
    }

    @Test
    public void testPagamentoCredito() {
        Pagamento pagamento = new Credito();
        double valorCompra = 1122;
        double valorEsperado = valorCompra * 1.1;
        double valorRetornado = pagamento.realizarPagamento(valorCompra);
        assertEquals(valorEsperado, valorRetornado, 0.001);
    }

    @Test
    public void testPagamentoPix() {
        Pagamento pagamento = new Pix();
        double valorCompra = 600;
        double valorEsperado = valorCompra * 0.9;
        double valorRetornado = pagamento.realizarPagamento(valorCompra);
        assertEquals(valorEsperado, valorRetornado, 0.001);
    }

    @Test
    public void testPagamentoBoleto() {
        Pagamento pagamento = new Boleto();
        double valorCompra = 160;
        double valorEsperado = valorCompra * 0.95;
        double valorRetornado = pagamento.realizarPagamento(valorCompra);
        assertEquals(valorEsperado, valorRetornado, 0.001);
    }
}