package Mentoring.p02_02;

public class Archer extends Character {
    public Archer(String name, int level) {
        this.name = name;
        this.level = level;
    }

    void attack() {
        System.out.println("Archer " + name + " shoots arrows at the enemy");
    }
}
