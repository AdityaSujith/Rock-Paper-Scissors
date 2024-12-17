import java.util.*;

/**
 * Driver class, sets up game.
 * Look to comments to see what you need to do to test your game.
 */
public class Main {
    public static void main(String[] args) {
        Player[] players = new Player[2]; // Update array based on number of players
        boolean printsRun = false;        // Boolean to display moves as game goes, used for debugging

        // Add players to the game
        players[0] = new CopycatPlayer("Copycat");
        players[1] = new RandomPlayer("Random");

        // Construct the game with the players array, calls play, and displays the score
        // DO NOT CHANGE
        Game newGame = new Game(players, printsRun);
        newGame.play();
        newGame.displayScore();
    }
}
