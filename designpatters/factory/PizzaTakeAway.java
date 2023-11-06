package designpatters.factory;

import designpatters.factory.pizzaFactory.ChicagoStylePizzaStore;
import designpatters.factory.pizzaFactory.PizzaStore;
import designpatters.factory.pizzas.Pizza;

public class PizzaTakeAway{
    public static void main(String[] args) {

        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

    }

}
