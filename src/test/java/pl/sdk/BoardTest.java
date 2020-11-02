package pl.sdk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BoardTest {

    @Test
    void shouldAddCreature() {
        Creature creature = new Creature();
        Point point = new Point(1, 1);
        Board board = new Board();
        board.add(point, creature);

        Creature creatureFromBoard = board.get(1, 1);

        assertEquals(creature, creatureFromBoard);
    }

}