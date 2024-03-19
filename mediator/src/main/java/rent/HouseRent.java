package rent;

import mediator.Mediator;

public class HouseRent extends Rent{

    public HouseRent(String name, Long money, Mediator mediator) {
        super(name, money, mediator);
    }

    @Override
    public void rent() {
        super.mediator.buy(this);
    }


}
