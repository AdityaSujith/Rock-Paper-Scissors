import java.util.Random;

public class RandomPlayer implements Player {
    private String name;
    private Random random;

    public RandomPlayer(String name) {
        this.name = name;
        this.random = new Random();
    }

    @Override
    public String move(String[] myMoves, String[] opponentMoves, int myScore, int opponentScore) {
        return getRandomMove();
    }

    @Override
    public String getName() {
        return this.name;
    }

    private String getRandomMove() {
        String[] moves = {"rock", "paper", "scissors"};
        return moves[random.nextInt(moves.length)];
    }
}
