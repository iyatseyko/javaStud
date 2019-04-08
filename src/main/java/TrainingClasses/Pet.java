package TrainingClasses;

public class Pet {

    int age;
    float weight;
    float height;
    String color;


    public  void sleep() {
        System.out.println("good night");
    }

    public  void eat() {
        System.out.println("I want to eat" );

    }

    public String say(String aWord){
        String petResponse = "Okey".concat(aWord);
        return petResponse;}
}
