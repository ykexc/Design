package food.beverage;

import food.Matter;

import java.math.BigDecimal;

public class Rice implements Matter {
    @Override
    public String scene() {
        return "主食";
    }

    @Override
    public String brand() {
        return "金龙鱼";
    }

    @Override
    public BigDecimal price() {
        return BigDecimal.valueOf(55.3);
    }

    @Override
    public String desc() {
        return "普通的金龙鱼大米";
    }
}
