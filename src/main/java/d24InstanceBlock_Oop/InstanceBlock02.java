package d24InstanceBlock_Oop;

public class InstanceBlock02 {
    int year;
    {System.out.println("Hello, Enjoy your driving");}
    public InstanceBlock02(){
       // System.out.println("Hello, Enjoy your driving");//move to instance block
    }
    public  InstanceBlock02(int year){
        System.out.println("model= "+year);
        this.year=year;

    }

      String color;
      String fueltype;
    {
        color="black";
        System.out.println("color = " + color);
        fueltype="Diesel";
        System.out.println( "fueltype: "+ fueltype);
    }
      public InstanceBlock02(String color, String fueltype){
          this.color=color;
          this.fueltype=fueltype;
          System.out.println("color: "+color+" and fueltype= "+fueltype);
      }
}
