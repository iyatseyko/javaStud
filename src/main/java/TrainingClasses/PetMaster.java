package TrainingClasses;

import TrainingClasses.Fish;
import TrainingClasses.Pet;

public class PetMaster {

    public static  void main (String[] args) {
        String petReaction;
        Pet myPet = new Pet();
        myPet.eat();
        petReaction = myPet.say(" Chick-chirik");
        System.out.println(petReaction);
        myPet.sleep();
        String petTalk = myPet.say(" Hello" );
        System.out.println(petTalk);
        Fish myFish = new Fish(10);
        myFish.dive(25);
        myFish.dive(100);
        myFish.sleep();

        String fishTalk = myFish.say("Hello" );
        System.out.println(fishTalk);


        StringBuilder bl;
        StringBuffer bf;


    }
}
