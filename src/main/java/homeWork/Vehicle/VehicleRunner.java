package homeWork.Vehicle;

public class VehicleRunner {
    public static void main(String[] args) {
        Veh_Car car=new Veh_Car();
        Veh_Bicycle bicycle= new Veh_Bicycle();
        car.start();
        car.stop();
        bicycle.start();
        bicycle.stop();
    }
}
