package pl.sdk;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardMovingTest {
    private Board board;
    private Creature creature;

    @BeforeEach
    void init() {
        board = new Board();
        creature = new Creature();
    }

    @Test
    void creatureShouldMove() {
        Point start = new Point(0, 0);
        Point end = new Point(1, 1);
        board.add(start, creature);

        board.moveCreature(start, end);

        assertEquals(board.get(1, 1), creature);
        assertNull(board.get(0, 0));
    }
}