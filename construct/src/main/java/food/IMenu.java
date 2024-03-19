package food;

public interface IMenu {

    IMenu appendBeverage(Matter beverage);



    IMenu appendDishes(Matter dishes);


    IMenu appendStapleFood(Matter stapleFood);


    String ofDetail();

}
