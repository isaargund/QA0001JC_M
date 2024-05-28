package d24InstanceBlock_Oop;

public class InstanceBlock {
    String Brand;

    {
        Brand="Mercedes";
        System.out.println("our brand is: "+Brand);


    }
    String color ;
    int model;
    String fuelType;

    public InstanceBlock(String color, int model, String fuelType) {
        this.color = color;
        this.model = model;
        this.fuelType = fuelType;
        System.out.println(color);
        System.out.println(model);
        System.out.println(fuelType);
    }
    public InstanceBlock(String color){
        this.color=color;
        System.out.println(color);
    }

    public static void main(String[] args) {
        InstanceBlock obj1=new InstanceBlock("black",2024,"diesel");
        InstanceBlock obj2=new InstanceBlock("white");

    }
}
//An instance block is a block of code that runs every time an object of class initiated....

    /*
    Main charachteristic of Intance block;
    1-) Run for every instance; The instance block runs every time a new instance of a class is created....
    That means for every new object, this block is executed/run again....

    2) Prevents Code Repetition; By using instance blocks,
    You avoid repeating the initialization processes or specific pieces of codes for every object.....

    A real-life example: Consider a car class. When each instance (object) of the car is created,
   you could use instance blocks to set the car's color and fuel type.
   For example: The instance block runs every time a car object is created and
   initializes the car's color to black and fuel type to gasoline.
   This ensures that every new car starts with the same initial values.
    Other properties are then set, which saves us from repetition.

     */