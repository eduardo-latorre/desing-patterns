package creational.abstractfactory;

import creational.abstractfactory.classes.PC;
import creational.abstractfactory.classes.Computer;
import creational.abstractfactory.factory.ComputerFactory;
import creational.abstractfactory.factory.PCFactory;
import creational.abstractfactory.factory.ServerFactory;

/*
* - Same as factory but everything is encapsulated
* - Uses interfaces for abstraction
* */
public class MainAbstractFactory {

    public static void main(String[] args){
        Computer pc = ComputerFactory.createComputer(new PCFactory("16 gb", "1.5 hrz", "128 gb SDD"));
        Computer server = ComputerFactory.createComputer(new ServerFactory("32 gb", "2.5 hrz", "1 tb SDD"));
    }
}
