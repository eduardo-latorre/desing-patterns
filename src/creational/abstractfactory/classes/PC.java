package creational.abstractfactory.classes;

public class PC implements Computer {

    private String RAM, CPU, HDD;

    public PC(String RAM, String CPU, String HDD) {
        this.RAM = RAM;
        this.CPU = CPU;
        this.HDD = HDD;
    }

    public void startPC(){
        System.out.println("PC has just been started");
    }

    @Override
    public String getRam() {
        return this.RAM;
    }

    @Override
    public String getHDD() {
        return this.HDD;
    }

    @Override
    public String getCPU() {
        return this.CPU;
    }
}
