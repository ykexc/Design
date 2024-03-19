package strategy.service;

import strategy.IStrategy;

public class ShopService {

    private IStrategy strategy;


    public ShopService(IStrategy strategy) {
        this.strategy = strategy;
    }

    public Double calculatePrice(Double money) {
        return strategy.calculateDiscount(money);
    }

}
