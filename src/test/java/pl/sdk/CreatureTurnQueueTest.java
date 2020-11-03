package pl.sdk;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CreatureTurnQueueTest {

    private Creature creature;
    private Creature creature2;
    private Creature creature3;
    private Collection<Creature> creatureList;

    @BeforeEach
    void init() {
        creature = new Creature();
        creature2 = new Creature();
        creature3 = new Creature();
        creatureList = new ArrayList<>();
        creatureList.add(creature);
        creatureList.add(creature2);
        creatureList.add(creature3);
    }

    @Test
    void shouldPickNextCreature() {
        CreatureTurnQueue creatureTurnQueue = new CreatureTurnQueue(creatureList);
        assertEquals(creature, creatureTurnQueue.getActiveCreature());
        creatureTurnQueue.next();

        assertEquals(creature2, creatureTurnQueue.getActiveCreature());
        creatureTurnQueue.next();

        assertEquals(creature3, creatureTurnQueue.getActiveCreature());
        creatureTurnQueue.next();

        assertEquals(creature, creatureTurnQueue.getActiveCreature());
    }
}