
package designpatters.strategy.quack;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("designPatterns.strategy.quack.Quack");
    }
}