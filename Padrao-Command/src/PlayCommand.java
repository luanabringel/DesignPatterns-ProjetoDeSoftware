package src;

public class PlayCommand implements Command{
    private Radio radio;
    
    public PlayCommand(Radio radio) {
        this.radio = radio;
    }
    
    @Override
    public void executar() {
        radio.play();
    }

}
