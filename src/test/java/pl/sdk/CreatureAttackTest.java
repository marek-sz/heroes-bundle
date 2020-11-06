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
        attacker.attack(defender);
        assertEquals(9, defender.getCurrentHealthPoints());
    }

    @Test
    void defenderShouldLost1HpWhenHisDefenseIsGreaterThanAttackerAttack() {
        attacker.attack(greatDefender);
        assertEquals(9, greatDefender.getCurrentHealthPoints());
    }

    @Test
    void creatureShallDieWhenItsHpIs0orLess() {
        greatAttacker.attack(defender);
        assertEquals(0, defender.getCurrentHealthPoints());
    }

}