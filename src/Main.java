
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
//        String IMGfilename = "src/images/puzzle1.jpg";
//        GameWindows gameWindows = new GameWindows(5, 5, IMGfilename);
//        
//        gameWindows.setVisible(true);
        
        Game game = new Game(5, 5);
        game.printBoard();
        System.out.println(game.isFinished());
    }
    
}
