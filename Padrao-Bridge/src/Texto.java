package src;

class Texto implements Mensagem {
    private String mensagem;

    public Texto(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String corpoMensagem() {
        return "src.Mensagem em texto: " + mensagem;
    }
}