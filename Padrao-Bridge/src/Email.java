package src;

class Email extends EnviarMensagem{
    
    public Email(String destinatario, Mensagem tipoMensagem) {
        super(destinatario, tipoMensagem);
    }

    @Override
    public void enviar(String destinatario, Mensagem mensagem) {
        System.out.println("Destinatário: " + mensagem.corpoMensagem());

    }
}
