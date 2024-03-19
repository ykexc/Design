package strategy.impl;

import strategy.IStrategy;

public class DiscountStrategy implements IStrategy {

    private Double discount;

    public DiscountStrategy(Double discount) {
        this.discount = discount;
    }

    @Override
    public Double calculateDiscount(Double price) {
        return discount * price;
    }
}
