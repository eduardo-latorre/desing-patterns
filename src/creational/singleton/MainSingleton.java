package creational.singleton;

/*
* Singleton only use one instance of a class, so whenever you create a new
* Singleton object it will always have the same instance, that's why singleton
* constructor is always private
* */
public class MainSingleton {

    public static void main(String[] args){
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();

        singleton1.increaseCounter(20);
        System.out.println("Counter singleton 1: " + singleton1.getCounter());

        singleton2.increaseCounter(5);
        System.out.println("Counter singleton 2: " + singleton2.getCounter());
    }
}
