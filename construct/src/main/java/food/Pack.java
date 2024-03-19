package food;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Pack implements IMenu {


    private List<Matter> lists = new ArrayList<>();

    private BigDecimal price = BigDecimal.ZERO;


    private int copies = 1;

    public Pack(int copies) {
        this.copies = copies;
    }

    public Pack() {
    }

    @Override
    public IMenu appendBeverage(Matter beverage) {
        lists.add(beverage);
        price = price.add(beverage.price());
        return this;
    }

    @Override
    public IMenu appendDishes(Matter dishes) {
        lists.add(dishes);
        price = price.add(dishes.price());
        return this;
    }

    @Override
    public IMenu appendStapleFood(Matter stapleFood) {
        lists.add(stapleFood);
        price = price.add(stapleFood.price());
        return this;
    }

    @Override
    public String ofDetail() {
        StringJoiner sj = new StringJoiner("[", " ", "]");
        for (var e : lists) sj.add(e.desc());
        sj.add("price").add(String.valueOf(price.doubleValue() * copies));
        return sj.toString();
    }
}
