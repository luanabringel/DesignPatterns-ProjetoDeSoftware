class Slack extends EnviarMensagem {

    public Slack(String destinatario, Mensagem tipoMensagem) {
        super(destinatario, tipoMensagem);
    }

    @Override
    public void enviar(String destinatario, Mensagem mensagem) {
        System.out.println("Destinatário: " + destinatario + mensagem.corpoMensagem());

    }
}
