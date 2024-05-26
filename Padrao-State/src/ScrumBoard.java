package src;

public class ScrumBoard{
    public static void main(String[] args) {
        UserStory userStory = new UserStory();

        userStory.mover(Cargo.Desenvolvedor);
        userStory.mover(Cargo.Desenvolvedor);

        userStory.setAprovacao(true);
        userStory.mover(Cargo.ScrumMaster);
        userStory.mover(Cargo.ScrumMaster);
    }
}
