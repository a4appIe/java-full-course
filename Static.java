class Game{
    static int score = 0;
    void increaseScore(){
        score++;
    }
}

public class Static {
    public static void main(String[] args) {
        Game game = new Game();
        game.increaseScore();
        System.out.println(Game.score);
        game.increaseScore();
        System.out.println(Game.score);
    }
}