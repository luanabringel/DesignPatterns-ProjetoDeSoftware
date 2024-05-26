public class GoBackCommand implements Command{
    private Radio radio;
    
    public GoBackCommand(Radio radio) {
        this.radio = radio;
    }
    
    @Override
    public void executar() {
        radio.goBack();
    }

}
