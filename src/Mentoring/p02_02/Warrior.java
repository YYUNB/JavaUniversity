package Mentoring.p02_02;

public class Warrior extends Character {
    public Warrior (String name, int level) {
        this.name = name;
        this.level = level;
    }

    void attack() {
        System.out.println("Warrior " + name + " performs a melee attack");
    }
}
