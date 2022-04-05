package creational.singleton;

public class Singleton {

    private static Singleton singleton = new Singleton();
    private int counter = 0;

    private Singleton(){
    }

    public void increaseCounter(int increase){
        counter += increase;
    }

    public int getCounter(){
        return counter;
    }

    public static Singleton getSingleton(){
        return singleton;
    }
}
