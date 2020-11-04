package pl.sdk;

public class Creature {

    private CreatureStatistics statistics;
    private int currentHealthPoints;

    Creature() {
        statistics = new CreatureStatistics("Archangel", 1, 0, 10, 10);
    }

    Creature(String creatureName, int attack, int defense, int healthPoints, int moveRange) {
        statistics = new CreatureStatistics(creatureName, attack, defense, healthPoints, moveRange);
        currentHealthPoints = healthPoints;
    }

    CreatureStatistics getStatistics() {
        return statistics;
    }

    void setStatistics(CreatureStatistics statistics) {
        this.statistics = statistics;
    }

    int getCurrentHealthPoints() {
        return currentHealthPoints;
    }

    void setCurrentHealthPoints(int currentHealthPoints) {
        this.currentHealthPoints = currentHealthPoints;
    }

    int damageToDeal(Creature defender) {
        int attackerAttack = this.getStatistics().getAttack();
        int defenderDefense = defender.getStatistics().getDefense();

        if (defenderDefense > attackerAttack) {
            return defender.getCurrentHealthPoints() - 1;
        }

        int damageToDeal = defender.getCurrentHealthPoints() - attackerAttack - defenderDefense;
        if (damageToDeal < 0) {
            return 0;
        }
        return damageToDeal;
    }
}