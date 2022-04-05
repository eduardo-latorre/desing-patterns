package creational.builder;

/*
* - When a constructor have so many arguments and some of them are optional
* - There's a main class and a builder class for the main
* - Main class has private constructor and getters NO setters
* - Builder class has only setters but NO getters
* */
public class MainBuilder {

    public static void main (String[] args){
        Vehicle bike = new Vehicle.VehicleBuilder("red", 2022, 2).build();
        System.out.println(bike.toString());

        Vehicle basicCar = new Vehicle.VehicleBuilder("blue", 2017, 4)
                .setDoor(4)
                .setCc(1.4f)
                .build();
        System.out.println(basicCar.toString());

        Vehicle fullCar = new Vehicle.VehicleBuilder("white", 2022, 4)
                .setDoor(5)
                .setAirbag(8)
                .setAirConditioner(true)
                .setCc(2.0f)
                .build();
        System.out.println(fullCar.toString());
    }
}
