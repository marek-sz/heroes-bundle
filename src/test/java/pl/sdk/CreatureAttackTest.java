package pl.sdk;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class CreatureAttackTest {
    public static final int NOT_IMPORTANT = 10;
    private Creature attacker;
    private Creature defender;
    private Creature greatAttacker;
    private Creature greatDefender;

    @BeforeEach
    void init() {
        attacker = new Creature("attacker", 1, 0, 10, NOT_IMPORTANT);
        defender = new Creature("defender", 1, 0, 10, NOT_IMPORTANT);
        greatAttacker = new Creature("GreatDefender", 99, 0, 10, NOT_IMPORTANT);
        greatDefender = new Creature("GreatDefender", 1, 100, 10, NOT_IMPORTANT);
    }

    @Test
    void defenderShouldLost1HpAfterAttack() {
        assertEquals(9, attacker.damageToDeal(defender));
    }

    @Test
    void defenderShouldLost1HpWhenHisDefenseIsGreaterThanAttackerAttack() {
        assertEquals(9, greatAttacker.damageToDeal(greatDefender));
    }

    @Test
    void creatureShallDieWhenItsHpIs0orLess() {
        assertEquals(0, greatAttacker.damageToDeal(defender));
    }

    @Test
    void creatureShallNotBeAbleToMoveWhenItsDead() {

        fail();
    }

    @Test
    void creatureShallNotBeAbleToAttackWhenItsDead() {
        fail();
    }

}