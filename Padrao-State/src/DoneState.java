package src;

public class DoneState implements UserStoryState {

    @Override
    public void mover(UserStory us, Cargo cargo){
        System.out.println("A User Story já está no estado final.");
    }
}
