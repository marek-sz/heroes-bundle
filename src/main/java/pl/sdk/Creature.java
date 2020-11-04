package pl.sdk;

public class Creature {

    private CreatureStatistics statistics;
    private int currentHealthPoints;

    Creature() {
        statistics = new CreatureStatistics("Archangel", 1, 0, 10, 10);
    }

    Creature(String creatureName, int attack, int defense, int healthPoints, int moveRange) {
        statistics = new CreatureStatistics(creatureName, attack, defense, healthPoints, moveRange);
        currentHealthPoints = statistics.getHealthPoints();
    }

    CreatureStatistics getStatistics() {
        return statistics;
    }

    int getCurrentHealthPoints() {
        return currentHealthPoints;
    }

    void attack(Creature defender) {
        int damageToDeal = this.statistics.getAttack() - defender.statistics.getDefense();
        if (damageToDeal < 0) {
            defender.currentHealthPoints -= 1;
        } else {
            defender.currentHealthPoints -= damageToDeal;
            if (!isAlive(defender)) {
                defender.currentHealthPoints = 0;
            }
        }
    }

    private boolean isAlive(Creature creature) {
        return creature.currentHealthPoints > 0;
    }
}