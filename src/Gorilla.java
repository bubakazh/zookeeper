public class Gorilla extends Mammal {
    public void throwSomething(int num){
        System.out.format("The gorilla threw %d banana peel(s)!\n", num);
        for(int i = 0; i < num; i++) {
            energyLevel -= 5;
        }
        System.out.println(energyLevel);
    }
    public void eatBananas(int num){
        System.out.format("The gorilla ate %d bananas and is ECSTATIC!\n", num);
        for(int i = 0; i < num; i++) {
            energyLevel += 10;
        }
        System.out.println(energyLevel);
    }
    public void climb(int num){
        System.out.format("The gorilla climbed %d tree(s)!\n", num);
        for(int i = 0; i < num; i++) {
            energyLevel -= 10;
        }
        System.out.println(energyLevel);
    }
}
