package d28Interfaces;

public class AudiA5 extends Audi implements Brake,Engine,Aircoditions {


    @Override
    public void abs() {
        System.out.println("A5 uses abs");
    }

    @Override
    public void eco() {
        System.out.println("A5 uses eco engine");
    }

    @Override
    public void turbo() {
        System.out.println("A5 have turbo");
    }

    @Override
    public void gas() {
        System.out.println("A 5 uses gas engine");
    }


}
