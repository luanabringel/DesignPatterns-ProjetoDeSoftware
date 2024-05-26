
public class ToVerifyState implements UserStoryState{

    @Override
    public void mover(UserStory us, Cargo cargo){
        if(cargo == Cargo.ScrumMaster){
            if (us.verificaAprovacao()) {
                us.setState(new DoneState());
            }else{
                us.setState(new ToDoState());
            }
        }else{
            System.out.println("Apenas o Scrum Master pode mover para 'Done' ou 'To Do'");
        }
    }
}
