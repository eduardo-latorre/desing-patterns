package creational.builder;

public class Vehicle {
    //Required
    private String color;
    private int year, wheel;

    //Optional
    private int airbag, door;
    private float cc;
    private boolean airConditioner;

    private Vehicle(VehicleBuilder builder) {
        this.color = builder.color;
        this.year = builder.year;
        this.wheel = builder.wheel;
        this.airbag = builder.airbag;
        this.door = builder.door;
        this.cc = builder.cc;
        this.airConditioner = builder.airConditioner;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public int getWheel() {
        return wheel;
    }

    public int getAirbag() {
        return airbag;
    }

    public float getCc() {
        return cc;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "color='" + color + '\'' +
                ", year=" + year +
                ", wheel=" + wheel +
                ", airbag=" + airbag +
                ", door=" + door +
                ", cc=" + cc +
                ", airConditioner=" + airConditioner +
                '}';
    }

    //Builder class must be static and inside the main class
    public static class VehicleBuilder {
        //Required
        private String color;
        private int year, wheel;

        //Optional
        private int airbag, door;
        private float cc;
        private boolean airConditioner;

        //Constructor only for MANDATORY members
        public VehicleBuilder(String color, int year, int wheel) {
            this.color = color;
            this.year = year;
            this.wheel = wheel;
        }

        //Setters returning a BUILDER OBJECT for OPTIONAL members
        public VehicleBuilder setAirbag(int airbag) {
            this.airbag = airbag;
            return this;
        }

        public VehicleBuilder setDoor(int door) {
            this.door = door;
            return this;
        }

        public VehicleBuilder setCc(float cc) {
            this.cc = cc;
            return this;
        }

        public VehicleBuilder setAirConditioner(boolean airConditioner) {
            this.airConditioner = airConditioner;
            return this;
        }

        //Create a new instance on Vehicle with VehicleBuilder argument
        public Vehicle build(){
            return new Vehicle(this);
        }
    }
}
