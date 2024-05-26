package src;

import java.util.ArrayList;
import java.util.List;

public class Sistema {

private List<Livro> livros;

public Sistema() {
        
    this.livros = new ArrayList<>();
    }

    public void adicionarLivro(int id, String titulo) {
        Livro livro = new Livro(id, titulo);
        livros.add(livro);
    }

    public Livro buscarLivroTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                return livro;
            }
        }
        return null;
    }
    public List<Livro> listarLivrosDisponiveis() {
        List<Livro> disponiveis = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.isDisponivel()) {
                disponiveis.add(livro);
            }
        }
        return disponiveis;
    }
}