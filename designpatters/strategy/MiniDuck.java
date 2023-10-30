package designpatters.strategy;

import designpatters.strategy.ducks.Duck;
import designpatters.strategy.ducks.MallardDuck;

public class MiniDuck {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.perFormFly();

    }
}