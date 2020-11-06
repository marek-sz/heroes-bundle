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
        board.add(new Point(0, 0), creature);
    }

    @Test
    void creatureShouldMove() {
        Point start = new Point(0, 0);
        Point end = new Point(1, 1);

        board.moveCreature(start, end);

        assertEquals(board.get(1, 1), creature);
        assertNull(board.get(0, 0));
    }

    @Test
    void shouldThrowExceptionWhenCreatureIsTryingToMoveToEmptyField() {
        Point start = new Point(0, 0);
        Point end = new Point(1, 1);

        board.add(end, new Creature());

        assertThrows(IllegalArgumentException.class, () -> board.moveCreature(start, end));
    }

    @Test
    void shouldThrowExceptionWhenTryAddCreatureOutOfMapBoundaries() {
        assertThrows(IllegalArgumentException.class, () -> board.add(new Point(21, 0), new Creature()));
        assertThrows(IllegalArgumentException.class, () -> board.add(new Point(0, 16), new Creature()));
        assertThrows(IllegalArgumentException.class, () -> board.add(new Point(0, -16), new Creature()));
        assertDoesNotThrow(() -> board.add(new Point(20,15), new Creature()));
    }

    @Test
    void shouldReturnCorrectLocationForCreature() {
        board.add(new Point(5, 5), creature);

        assertEquals(new Point(5,5), board.get(creature));
    }

}