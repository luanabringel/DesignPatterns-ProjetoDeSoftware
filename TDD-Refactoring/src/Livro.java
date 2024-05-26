package src;

public class Livro {
    private int id;
    private String titulo;
    private boolean disponivel;

    public Livro(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
        this.disponivel = true;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }
}