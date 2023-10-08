package Mentoring.p02_02;

public class CharacterTest {
    public static void main(String[] args) {
        // Warrior 객체 생성
        Warrior warrior = new Warrior("Garen", 10);
        System.out.println("Warrior: ");
        System.out.println("Name: " + warrior.name);
        System.out.println("Level: " + warrior.level);
        warrior.attack();
        System.out.println();

        // Mage 객체 생성
        Mage mage = new Mage("Ryze", 12);
        System.out.println("Mage: ");
        System.out.println("Name: " + mage.name);
        System.out.println("Level: " + mage.level);
        mage.attack();
        System.out.println();

        // Archer 객체 생성
        Archer archer = new Archer("Ashe", 8);
        System.out.println("Archer: ");
        System.out.println("Name: " + archer.name);
        System.out.println("Level: " + archer.level);
        archer.attack();
        System.out.println();
    }
}
