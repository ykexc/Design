package food.beverage;

import food.Matter;

import java.math.BigDecimal;

public class Noodles implements Matter {
    @Override
    public String scene() {
        return "主食";
    }

    @Override
    public String brand() {
        return "香雪";
    }

    @Override
    public BigDecimal price() {
        return BigDecimal.valueOf(54.9);
    }

    @Override
    public String desc() {
        return "普通面条";
    }
}
