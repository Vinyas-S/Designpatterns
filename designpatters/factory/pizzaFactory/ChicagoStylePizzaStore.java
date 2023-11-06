package designpatters.factory.pizzaFactory;

import designpatters.factory.pizzas.ChicagoStyleCheesePizza;
import designpatters.factory.pizzas.ChicagoStylePepperoniPizza;
import designpatters.factory.pizzas.Pizza;

public class ChicagoStylePizzaStore extends PizzaStore{
    public Pizza createPizza(String type) {
        Pizza pizza;
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new ChicagoStylePepperoniPizza();
        } else {
            pizza = new ChicagoStyleCheesePizza();
        }

        return pizza;
    }
}
