package tests;

import src.Livro;
import src.Sistema;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SistemaTest {
    private Sistema sistema;

    @BeforeEach
    void setUp() {
        sistema = new Sistema();
        sistema.adicionarLivro(1, "Livro A");
        sistema.adicionarLivro(2, "Livro B");
        sistema.adicionarLivro(3, "Livro C");
    }


    @Test
    void BuscarPorTituloExistenteTest() {
        Livro livro = sistema.buscarLivroTitulo("Livro B");
        assertNotNull(livro);
        assertEquals("Livro B", livro.getTitulo());
    }

    @Test
    void BuscarPorTituloInexistenteTest() {
        Livro livro = sistema.buscarLivroTitulo("Livro D");
        assertNull( livro);
    }

    @Test
    void ListarLivrosDisponiveisTest() {
        assertEquals(3, sistema.listarLivrosDisponiveis().size());
    }
}