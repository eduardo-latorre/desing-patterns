package creational.abstractfactory.factory;

import creational.abstractfactory.classes.Computer;

public class ComputerFactory {
    public static Computer createComputer(ComputerAbstractFactory caf){
        return caf.createComputer();
    }
}
