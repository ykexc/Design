package food.staplefood;

import food.Matter;

import java.math.BigDecimal;

public class PepsiCola implements Matter {
    @Override
    public String scene() {
        return "饮料";
    }

    @Override
    public String brand() {
        return "百事可乐";
    }

    @Override
    public BigDecimal price() {
        return BigDecimal.valueOf(3);
    }

    @Override
    public String desc() {
        return "百事可乐中瓶";
    }
}
