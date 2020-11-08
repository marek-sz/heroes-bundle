package pl.sdk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CreatureCounterAttackTest {

    @Test
    void attackerShouldLost1HpAfterDefenderCounterAttack() {
        Creature attacker = new Creature("attacker", 1, 0, 10, 5);
        Creature defender = new Creature("defender", 1, 0, 10, 5);
        attacker.attack(defender);
        assertEquals(9, attacker.getCurrentHealthPoints());
    }

}