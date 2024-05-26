public class Cliente{
    public static void main(String[] args) {
        Radio radio = new Radio();
            
        Command playCommand = new PlayCommand(radio);
        Command stopCommand = new StopCommand(radio);
        Command goBackCommand = new GoBackCommand(radio);
        Command goForwardCommand = new GoForwardCommand(radio);
            
        ControleRemoto controle = new ControleRemoto();

        controle.setCommand(playCommand);
        controle.selecionarBotao();
            
        controle.setCommand(stopCommand);
        controle.selecionarBotao();
            
        controle.setCommand(goBackCommand);
        controle.selecionarBotao();
            
        controle.setCommand(goForwardCommand);
        controle.selecionarBotao();
        }

}
