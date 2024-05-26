package src;

class Imagem implements Mensagem {
    private String mensagem;

    public Imagem(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String corpoMensagem() {
        return "src.Mensagem em imagem: " + mensagem;
    }
}
