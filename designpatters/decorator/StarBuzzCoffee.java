package designpatters.decorator;

import designpatters.decorator.component.Beverage;
import designpatters.decorator.component.DarkRoast;
import designpatters.decorator.component.Expresso;
import designpatters.decorator.component.HouseBlend;
import designpatters.decorator.decorator.Mocha;
import designpatters.decorator.decorator.Soy;

public class StarBuzzCoffee {
    public static void main(String[] args) {
//        Beverage espresso = new Expresso();
//        getBeverage(espresso);
//
//        Beverage darkRoast = new DarkRoast();
//        System.out.println(darkRoast);
//        darkRoast = new Mocha(darkRoast);
//        System.out.println(darkRoast);
//        getBeverage(darkRoast);

        Beverage houseBlend = new HouseBlend();
        System.out.println(houseBlend);
        houseBlend = new Mocha(houseBlend);
        System.out.println(houseBlend);
        houseBlend = new Soy(houseBlend);
        System.out.println(houseBlend);
        getBeverage(houseBlend);
    }

    public static void getBeverage(Beverage beverage) {
        System.out.println(beverage.getDescription() + " $ " + beverage.cost());
    }
}
