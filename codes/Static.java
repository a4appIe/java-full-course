class Game{
    static int score = 0;
    String player;
    static String name;
    public Game(){
        System.out.println("inside constructor");
    }
    void increaseScore(){
        score++;
    }
    static void show(Game game){
        System.out.println("Player " + game.player + " has " + score + " score.");
    }
    static{
        name = "John doe";
        System.out.println("inside static block");
    }

}

public class Static {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Game game = new Game();
        @SuppressWarnings("unused")
        Game game2 = new Game();
        // game.player = "Nitin";
        // game.increaseScore();
        // System.out.println(Game.score);
        // game.increaseScore();
        // System.out.println(Game.score);
        // Game.show(game);
    }
}