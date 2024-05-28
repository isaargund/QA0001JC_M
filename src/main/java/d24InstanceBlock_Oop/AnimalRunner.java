package d24InstanceBlock_Oop;

public class AnimalRunner {
    public static void main(String[] args) {


        Bird bird = new Bird();
        bird.eat();
        bird.drink();
        bird.tweet();

        Cat cat = new Cat();
        cat.eat();
        cat.drink();
        cat.meow();
        cat.giveBirth();

        Dog dog=new Dog();
        dog.eat();
        dog.drink();
        dog.bark();
        dog.giveBirth();

        SmallDogs smallDogs = new SmallDogs();
        smallDogs.cutness();

    }

}
