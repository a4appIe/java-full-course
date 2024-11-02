class Game{
    static int score = 0;
    String player;
    void increaseScore(){
        score++;
    }
    static void show(Game game){
        System.out.println("Player " + game.player + " has " + score + " score.");
    }
}

public class Static {
    public static void main(String[] args) {
        Game game = new Game();
        game.player = "Nitin";
        game.increaseScore();
        System.out.println(Game.score);
        game.increaseScore();
        System.out.println(Game.score);
        Game.show(game);
    }
}