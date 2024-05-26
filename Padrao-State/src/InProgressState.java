package src;

public class InProgressState implements UserStoryState {

    @Override
    public void mover(UserStory us, Cargo cargo){
        if(cargo == Cargo.Desenvolvedor){
            us.setState(new ToVerifyState());
        } 
        else{
            System.out.println("Apenas desenvolvedores podem mover para 'ToVerify'");
        }
    }
}
