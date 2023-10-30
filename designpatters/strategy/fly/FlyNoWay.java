package designpatters.strategy.fly;

public class FlyNoWay implements FlyBehaviour{
    @Override
    public void fly(){
        System.out.println("Fly No Way");
    }
}