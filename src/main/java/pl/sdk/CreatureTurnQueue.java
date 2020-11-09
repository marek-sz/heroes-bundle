package pl.sdk;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

public class CreatureTurnQueue {

    private final Collection<Creature> creatureList;
    private Queue<Creature> movementOrder;
    private Creature activeCreature;


    public CreatureTurnQueue(Collection<Creature> creatureList) {
        this.creatureList = creatureList;
        movementOrder = new LinkedList<>();
        initQueue();
        next();
    }

    Creature getActiveCreature() {
        return activeCreature;
    }

    void next() {
        if (movementOrder.isEmpty()) {
            initQueue();
        }
        activeCreature = movementOrder.poll();
    }

    private void initQueue() {
        movementOrder.addAll(creatureList);
        creatureList.forEach(Creature::resetCounterAttacksInNewRound);
    }
}
