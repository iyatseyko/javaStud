package TrainingClasses;

public class Pet {

    String name;
    int age;
    float weight;
    float height;
    String color;

    public Pet (String name){
        this.name=name;
    }

    public  void sleep() {
        System.out.println("good night");
    }

    public  void eat() {
        System.out.println("I want to eat" );

    }

    public String say(String aWord){
        String petResponse = "Okey".concat(aWord);
        return petResponse;}


    public String toString () {
        return name;
    }
}
