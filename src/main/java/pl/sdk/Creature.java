package pl.sdk;

public class Creature {

    private CreatureStatistics statistics;
    private int currentHealthPoints;
    private boolean counterAttackedInThisTurn;

    Creature() {
        statistics = new CreatureStatistics("Archangel", 1, 0, 10, 10);
    }

    Creature(String creatureName, int attack, int defense, int healthPoints, int moveRange) {
        statistics = new CreatureStatistics(creatureName, attack, defense, healthPoints, moveRange);
        currentHealthPoints = statistics.getHealthPoints();
    }

    int getCurrentHealthPoints() {
        return currentHealthPoints;
    }

    void attack(Creature defender) {
        if (isAlive()) {
            int damageToDeal = calculateDamage(defender);
            defender.currentHealthPoints -= damageToDeal;
            if (defender.currentHealthPoints < 0) {
                defender.currentHealthPoints = 0;
            }
            counterAttack(defender);
        }
    }

    private void counterAttack(Creature defender) {
        if (!defender.counterAttackedInThisTurn) {
            int damageToDealCounterAttack = defender.calculateDamage(this);
            currentHealthPoints -= damageToDealCounterAttack;
            defender.counterAttackedInThisTurn = true;
        }
    }

    private int calculateDamage(Creature defender) {
        int damageToDeal = this.statistics.getAttack() - defender.statistics.getDefense();
        if (damageToDeal < 0) {
            damageToDeal = 1;
        }
        return damageToDeal;
    }

    private boolean isAlive() {
        return currentHealthPoints > 0;
    }

    void resetCounterAttacksInNewRound() {
        this.counterAttackedInThisTurn = false;
    }
}