package strategy.impl;

import strategy.IStrategy;

public class FullReductionStrategy implements IStrategy {
    @Override
    public Double calculateDiscount(Double price) {
        if (price >= 1000) return price - 50;
        if (price >= 200) return price - 200;
        return price;
    }
}
