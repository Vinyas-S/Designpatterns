package designpatters.adapter;

import designpatters.adapter.adapter.TurkeyAdapter;
import designpatters.adapter.animals.Duck;
import designpatters.adapter.animals.MallardDuck;
import designpatters.adapter.animals.Turkey;
import designpatters.adapter.animals.WildTurkey;

public class Client {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe duck says...");
        testDuck(duck);

        System.out.println("\nThe turkey designPatterns.adapter says...");
        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
