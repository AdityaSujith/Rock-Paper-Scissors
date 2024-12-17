import java.util.Random;

public class CopycatPlayer implements Player {
    private String name;
    private Random random;
    private String nextMove; // Stores the move for the next round

    // Constructor to set the player's name
    public CopycatPlayer(String name) {
        this.name = name;
        this.random = new Random();
        this.nextMove = getRandomMove(); // Initial move is random
    }

    @Override
    public String move(String[] myMoves, String[] opponentMoves, int myScore, int opponentScore) {
        return nextMove;
    }

    @Override
    public String getName() {
        return this.name;
    }

    // Method to set the next move if the player wins
    public void setNextMove(String opponentMove, boolean didWin) {
        if (didWin) {
            nextMove = opponentMove; // Copy opponent's move if the player wins
        } else {
            nextMove = getRandomMove(); // Otherwise, choose a random move
        }
    }

    // Helper method to generate a random move
    private String getRandomMove() {
        String[] moves = {"rock", "paper", "scissors"};
        return moves[random.nextInt(moves.length)];
    }
}
