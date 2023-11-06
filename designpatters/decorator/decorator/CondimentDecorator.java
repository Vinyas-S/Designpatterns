package designpatters.decorator.decorator;

import designpatters.decorator.component.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public abstract String getDescription();
}
