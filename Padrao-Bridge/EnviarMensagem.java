abstract class EnviarMensagem {
    protected String destinatario;
    protected Mensagem tipoMensagem;

    public EnviarMensagem(String destinatario, Mensagem tipoMensagem){
    }

    public void enviar(String destinatario, Mensagem tipoMensagem){
    }

    public String getDestinatario(){
        return destinatario;
    }

    public void setDestinatario(String destinatario){
        this.destinatario = destinatario;
    }
}