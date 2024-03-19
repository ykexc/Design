package lease;

import mediator.Mediator;

public abstract class Lease {

    protected String name;

    protected Long money;

    protected Mediator mediator; //miːdieɪtər/


    protected Lease(String name, Long money, Mediator mediator) {
        this.money = money;
        this.name = name;
        this.mediator = mediator;
    }


    public abstract void lease();


    public String getName() {
        return name;
    }

    public Long getMoney() {
        return money;
    }

}
