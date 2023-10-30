package designpatters.strategy.ducks;

import designpatters.strategy.fly.FlyWithWings;
import designpatters.strategy.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Mallard Duck");
    }
}