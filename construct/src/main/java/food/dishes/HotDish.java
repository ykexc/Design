package food.dishes;

import food.Matter;

import java.math.BigDecimal;

public class HotDish implements Matter {
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
        return BigDecimal.valueOf(9.6);
    }

    @Override
    public String desc() {
        return "普通热菜";
    }
}
