package pl.sdk;

import java.util.ArrayList;
import java.util.List;

public class GameEngine {
    private final Board board;
    private final CreatureTurnQueue queue;

    public GameEngine(List<Creature> creatures1, List<Creature> creatures2) {
        board = new Board();
        putCreaturesToBoard(creatures1, creatures2);
        List<Creature> twoSidedCreatures = new ArrayList<>();
        twoSidedCreatures.addAll(creatures1);
        twoSidedCreatures.addAll(creatures2);
        queue = new CreatureTurnQueue(twoSidedCreatures);
    }

    private void putCreaturesToBoard(List<Creature> creatures1, List<Creature> creatures2) {
        putCreaturesFromOneSideToBoard(creatures1, 0);
        putCreaturesFromOneSideToBoard(creatures2, Board.WIDTH - 1);
    }

    public void move(Point targetPoint) {
        board.moveThisCreature(queue.getActiveCreature(), targetPoint);
    }

    public void pass() {
        queue.next();
    }

    public void attack(Creature defender) {
        queue.getActiveCreature().attack(defender);
    }

    private void putCreaturesFromOneSideToBoard(List<Creature> creatures, int x) {
        for (int i = 0; i < creatures.size(); i++) {
            board.add(new Point(x, i * 2), creatures.get(i));
        }
    }
}
