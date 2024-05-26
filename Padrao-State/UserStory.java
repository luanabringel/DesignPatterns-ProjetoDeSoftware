public class UserStory {
    private UserStoryState state;
    private boolean aprovacao;

    public UserStory(){
        this.state = new ToDoState();
        this.aprovacao = false;
    }

    public void setState(UserStoryState state) {
        this.state = state;
    }

    public void mover(Cargo cargo){
        this.state.mover(this, cargo);
    }

    public boolean verificaAprovacao() {
        return aprovacao;
    }

    public void setAprovacao(boolean aprovacao) {
        this.aprovacao = aprovacao;
    }
}
