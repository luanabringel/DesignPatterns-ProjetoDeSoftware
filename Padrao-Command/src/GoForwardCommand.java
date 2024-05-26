package src;

public class GoForwardCommand implements Command{
    private Radio radio;
    
    public GoForwardCommand(Radio radio) {
        this.radio = radio;
    }
    
    @Override
    public void executar() {
        radio.goForward();
    }

}
