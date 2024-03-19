package food.dishes;

import food.Matter;

import java.math.BigDecimal;

public class ColdDish implements Matter {
    @Override
    public String scene() {
        return "菜品";
    }

    @Override
    public String brand() {
        return "一级";
    }

    @Override
    public BigDecimal price() {
        return BigDecimal.valueOf(15.8);
    }

    @Override
    public String desc() {
        return "一级凉菜，挺好吃";
    }
}
