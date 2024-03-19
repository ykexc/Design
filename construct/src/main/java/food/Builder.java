package food;

import food.beverage.Noodles;
import food.beverage.Rice;
import food.dishes.ColdDish;
import food.dishes.HotDish;
import food.staplefood.CocaCola;
import food.staplefood.PepsiCola;

public class Builder {






    public IMenu levelOne(int copies) {
        return new Pack(copies)
                .appendBeverage(new Rice())
                .appendDishes(new HotDish())
                .appendStapleFood(new CocaCola());
    }

    public IMenu levelOne() {
        return new Pack()
                .appendBeverage(new Rice())
                .appendDishes(new HotDish())
                .appendStapleFood(new CocaCola());
    }

    public IMenu levelTwo(int copies) {
        return new Pack(copies)
                .appendBeverage(new Noodles())
                .appendDishes(new ColdDish())
                .appendStapleFood(new PepsiCola());
    }

    public IMenu levelTwo() {
        return new Pack()
                .appendBeverage(new Noodles())
                .appendDishes(new ColdDish())
                .appendStapleFood(new PepsiCola());
    }

}
