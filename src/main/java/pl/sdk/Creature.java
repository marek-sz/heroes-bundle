package pl.sdk;

public class Creature {

    private CreatureStatistics statistics;
    private int currentHealthPoints;

    Creature() {
        statistics = new CreatureStatistics("Archangel", 1, 0, 10, 10);
    }

    Creature(String creatureName, int attack, int defense, int healthPoints, int moveRange) {
        statistics = new CreatureStatistics(creatureName, attack, defense, healthPoints, moveRange);
    }

}
