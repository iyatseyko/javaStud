package TrainingClasses;

import TrainingClasses.Pet;

public class Fish extends Pet {

    int currentDepth = 0;

    Fish(int startingPosition){
        currentDepth = startingPosition;
    }

    Fish(){
    }

    public int dive(int howDeep){
        currentDepth = currentDepth + howDeep;

        if (currentDepth > 100) {

            System.out.println( "I can Not dive so deep" );
        } else {
            System.out.println("Dive on depth " + howDeep);
            System.out.println("And now i am on depth " + currentDepth);
        }

        return currentDepth;
    }

    public String say(String something){
        return "Fishes do NOT speak !!!";
    }
}
