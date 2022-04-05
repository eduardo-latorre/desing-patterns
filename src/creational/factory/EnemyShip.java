package creational.factory;

public abstract class EnemyShip {
    private String name;
    private double amtDamage;

    public void displayEnemyShip(){
        System.out.println("The enemy " + getName() + " is on the screen");
    }

    public void followHeroShip(){
        System.out.println("The enemy is following the hero");
    }

    public void enemyShipShoots(){
        System.out.println("The enemy attack and does damage:" + getAmtDamage());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmtDamage() {
        return amtDamage;
    }

    public void setAmtDamage(double amtDamage) {
        this.amtDamage = amtDamage;
    }
}
