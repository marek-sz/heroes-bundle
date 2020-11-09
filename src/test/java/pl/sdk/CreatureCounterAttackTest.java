package pl.sdk;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CreatureCounterAttackTest {

    @Test
    void attackerShouldLost1HpAfterDefenderCounterAttack() {
        Creature attacker = new Creature("attacker", 1, 0, 10, 5);
        Creature defender = new Creature("defender", 1, 0, 10, 5);
        attacker.attack(defender);
        assertEquals(9, attacker.getCurrentHealthPoints());
    }

    @Test
    void creatureShouldBeAbleToCounterAttackOnceATurn() {
        Creature attacker = new Creature("attacker", 1, 0, 10, 5);
        Creature defender = new Creature("defender", 1, 0, 10, 5);
        Creature attacker2 = new Creature("attacker2", 1, 0, 10, 5);

        attacker.attack(defender);
        assertEquals(9, attacker.getCurrentHealthPoints());

        attacker2.attack(defender);
        assertEquals(10, attacker2.getCurrentHealthPoints());
    }

    @Test
    void inTheNextRoundDefenderCanCounterAttackAgain() {
        Creature attacker = new Creature("attacker", 1, 0, 10, 5);
        Creature defender = new Creature("defender", 1, 0, 10, 5);

        GameEngine gameEngine = new GameEngine(Arrays.asList(attacker), Arrays.asList(defender));

        gameEngine.attack(defender);
//        attacker.attack(defender);
        assertEquals(9, attacker.getCurrentHealthPoints());

        gameEngine.pass();
        gameEngine.pass();

        gameEngine.attack(defender);
//        attacker.attack(defender);
        assertEquals(8, attacker.getCurrentHealthPoints());
    }
}