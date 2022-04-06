package creational.abstractfactory.factory;

import creational.abstractfactory.classes.Computer;
import creational.abstractfactory.classes.PC;

public class PCFactory implements ComputerAbstractFactory{
    private String RAM, CPU, HDD;

    public PCFactory(String RAM, String CPU, String HDD) {
        this.RAM = RAM;
        this.CPU = CPU;
        this.HDD = HDD;
    }

    @Override
    public Computer createComputer() {
        return new PC(this.RAM, this.CPU, this.HDD);
    }
}
