public class StopCommand implements Command{
    private Radio radio;
    
    public StopCommand(Radio radio) {
        this.radio = radio;
    }
    
    @Override
    public void executar() {
        radio.stop();
    }
}
