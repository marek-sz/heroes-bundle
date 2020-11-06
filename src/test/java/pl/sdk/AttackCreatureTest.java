package pl.sdk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AttackCreatureTest {

    public static final int NOT_IMPORTANT = 10;

    @Test
    void defenderShouldLost10HpWhenAttackerWith10Attack() {
        Creature attacker = new Creature("Attacker", 10, 0, 100, NOT_IMPORTANT);
        Creature defender = new Creature("Defender", NOT_IMPORTANT, 0, 100, NOT_IMPORTANT);
        attacker.attack(defender);

        assertEquals(90, defender.getCurrentHealthPoints());
    }

    @Test
    void defenderShouldLostOnly1HpWhenHasGreaterDefenseThanAttackerAttack() {
        Creature attacker = new Creature("Attacker", 10, 0, 100, NOT_IMPORTANT);
        Creature defender = new Creature("Defender", NOT_IMPORTANT, 11, 100, NOT_IMPORTANT);

        attacker.attack(defender);

        assertEquals(99, defender.getCurrentHealthPoints());
    }
}