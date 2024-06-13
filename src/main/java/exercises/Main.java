package exercises;

public class Main {
    public static void main(String[] args) {
        Animal01 myDog = new dog();
        Cat myCat = new Cat();

        myDog.makeSound(); // Outputs: Dog barks
        myCat.makeSound(); // Outputs: Cat meows
    }
}
