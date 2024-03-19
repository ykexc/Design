package rent;

import mediator.Mediator;

public abstract class Rent {


    protected String name;

    protected Long money;

    protected Mediator mediator; //miːdieɪtər/


    protected Rent(String name, Long money, Mediator mediator) {
        this.money = money;
        this.name = name;
        this.mediator = mediator;
    }


    public abstract void rent();

    public String getName() {
        return name;
    }

    public Long getMoney() {
        return money;
    }

}
