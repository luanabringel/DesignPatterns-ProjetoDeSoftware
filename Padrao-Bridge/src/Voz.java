class Voz implements Mensagem {
    private String mensagem;

    public Voz(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String corpoMensagem() {
        return "Mensagem em voz: " + mensagem;
    }
}
