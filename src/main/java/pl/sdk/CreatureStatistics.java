package pl.sdk;

public class CreatureStatistics {
    private String creatureName;
    private int attack;
    private int defense;
    private int healthPoints;
    private int moveRange;

    CreatureStatistics(String creatureName, int attack, int defense, int healthPoints, int moveRange) {
        this.creatureName = creatureName;
        this.attack = attack;
        this.defense = defense;
        this.healthPoints = healthPoints;
        this.moveRange = moveRange;
    }

    String getCreatureName() {
        return creatureName;
    }

    void setCreatureName(String creatureName) {
        this.creatureName = creatureName;
    }

    int getAttack() {
        return attack;
    }

    void setAttack(int attack) {
        this.attack = attack;
    }

    int getDefense() {
        return defense;
    }

    void setDefense(int defense) {
        this.defense = defense;
    }

    int getHealthPoints() {
        return healthPoints;
    }

    void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    int getMoveRange() {
        return moveRange;
    }

    void setMoveRange(int moveRange) {
        this.moveRange = moveRange;
    }
}
