package pl.sdk;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class BoardTest {

    @Test
    void shouldAddCreature() {
        //given
        Creature creature = new Creature();
        Point point = new Point(1, 1);
        Board board = new Board();
        //when
        board.add(point, creature);
        Creature creatureFromBoard = board.get(point);
        //then
assertEquals();
    }

}