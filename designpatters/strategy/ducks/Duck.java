package designpatters.strategy.ducks;

import designpatters.strategy.fly.FlyBehaviour;
import designpatters.strategy.quack.QuackBehaviour;

public abstract class Duck{
    QuackBehaviour quackBehaviour;
    FlyBehaviour flyBehaviour;

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void perFormFly() {
        flyBehaviour.fly();
    }

    public abstract void display();

    public void setFlyBehavior(FlyBehaviour fb) {
        flyBehaviour = fb;
    }
       
    public void setQuackBehavior(QuackBehaviour qb) {
        quackBehaviour = qb;
       
    }
}