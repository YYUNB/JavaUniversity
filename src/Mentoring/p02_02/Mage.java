package Mentoring.p02_02;

public class Mage extends Character {
    public Mage (String name, int level) {
        this.name = name;
        this.level = level;
    }

    void attack() {
        System.out.println("Mage " + name + " casts a powerful spell");
    }
}
