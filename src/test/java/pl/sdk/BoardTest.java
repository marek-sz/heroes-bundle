package pl.sdk;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    private Board board;
    private Creature creature;

    @BeforeEach
    void init() {
        board = new Board();
        creature = new Creature();
    }

    @Test
    void shouldAddCreature() {
        Point point = new Point(2, 2);
        board.add(point, creature);
        Creature creatureFromBoard = board.get(2, 2);
        assertEquals(creature, creatureFromBoard);
    }

    @Test
    void cannotPutCreatureToAlreadyTakenTile() {
        Creature creature2 = new Creature();

        board.add(new Point(2, 2), creature);

        assertEquals(board.get(2, 2), creature);
        assertThrows(IllegalArgumentException.class, () -> board.add(new Point(2, 2), creature2));
    }

    @Test
    void shouldReturnNullIfFieldIsEmpty() {
        board.add(new Point(0, 0), new Creature());

        assertNotNull(board.get(0, 0));
        assertNull(board.get(2, 2));
    }

    @Test
    void shouldReturnNullIfFieldIsEmpty2() {
        board.add(new Point(0, 0), new Creature());

        assertNotNull(board.get(0, 0));
        assertNull(board.get(2, 2));
    }
}