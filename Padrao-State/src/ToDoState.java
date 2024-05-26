public class ToDoState implements UserStoryState{

    @Override
    public void mover(UserStory us, Cargo cargo){
        us.setState(new InProgressState());
    }
}
