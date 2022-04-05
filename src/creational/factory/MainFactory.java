package creational.factory;

import java.util.Scanner;

/*
* - Returning a specific class that has a super class in common
* */
public class MainFactory {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the enemy to be displayed U / R: ");
        String option = scanner.next();

        EnemyShip enemyShip = null;

        if (option.equals("U")){
            enemyShip = new UFOEnemyShip();
            executeEnemyShip(enemyShip);
        }else if(option.equals("R")){
            enemyShip = new RocketEnemyShip();
            executeEnemyShip(enemyShip);
        }else{
            System.out.println("Wrong option!");
        }
    }

    private static void executeEnemyShip(EnemyShip enemyShip) {
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoots();
    }
}
