package src;

public class RemoteControl {
    private Command comando;

    public void setCommand(Command comando){
        this.comando = comando;
        
    }

    public void selecionarBotao(){
        comando.executar();

    }
    
}
