package creational.abstractfactory.factory;

import creational.abstractfactory.classes.Computer;
import creational.abstractfactory.classes.Server;

public class ServerFactory implements ComputerAbstractFactory{
    private String RAM, CPU, HDD;

    public ServerFactory(String RAM, String CPU, String HDD) {
        this.RAM = RAM;
        this.CPU = CPU;
        this.HDD = HDD;
    }

    @Override
    public Computer createComputer() {
        return new Server(this.RAM, this.CPU, this.HDD);
    }
}
