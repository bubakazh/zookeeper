public class ZookeeperTest {
    public static void main(String[] args) {
        Mammal animal = new Mammal();
        Gorilla gorilla = new Gorilla();
        Bat bat = new Bat();
        // System.out.println(animal.energyLevel);
        // IF energyLevel IS PUBLIC, CAN SysOUT; IF PRIVATE, MUST USE METHOD.
        animal.displayEnergyLevel();
        gorilla.throwSomething(3);
        gorilla.eatBananas(2);
        gorilla.climb(1);
        bat.displayEnergyLevel();
        bat.attackTown(3);
        bat.eatHumans(2);
        bat.fly(2);
        int batEnergy = bat.displayEnergyLevel();
        System.out.println(batEnergy);
    }
}
