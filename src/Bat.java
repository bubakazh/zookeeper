public class Bat extends Mammal{
    public int energyLevel = 300;

    @Override
    public int displayEnergyLevel(){
        System.out.println(energyLevel);
        return this.energyLevel;
    }
    // LEARNING TO OVERRIDE PROPERLY.

    public void fly(int num){
        for(int i = 0; i < num; i++) {
            System.out.println("*flutter flutter*");
            energyLevel -= 50;
        }
//        System.out.println(energyLevel);
    }
    public void eatHumans(int num){
        System.out.format("%d corpse(s)... y0ikes runawaaaaaayyyyyy!!\n", num);
        for(int i = 0; i < num; i++) {
            energyLevel += 25;
        }
//        System.out.println(energyLevel);
    }
    public void attackTown(int num){
        System.out.format("screams, fire, yadayada can be heard from %d nearby towns...\n", num);
        for(int i = 0; i < num; i++) {
            energyLevel -= 100;
        }
//        System.out.println(energyLevel);
    }
}
