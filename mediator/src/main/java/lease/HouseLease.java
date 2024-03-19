package lease;

import mediator.Mediator;

public class HouseLease extends Lease{
    public HouseLease(String name, Long money, Mediator mediator) {
        super(name, money, mediator);
    }

    @Override
    public void lease() {
        super.mediator.sell(this);
    }


}
