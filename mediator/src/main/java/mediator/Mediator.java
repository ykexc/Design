package mediator;

import lease.Lease;
import rent.Rent;

import java.util.ArrayDeque;
import java.util.Deque;

public abstract class Mediator {

    protected static Deque<Rent> rentQueue = new ArrayDeque<>();

    protected static Deque<Lease> leaseQueue = new ArrayDeque<>();



    protected abstract void trade(Lease lease);

    protected abstract void trade(Rent rent);
    public void buy(Rent rent) {
        rentQueue.add(rent);
        trade(rent);
    }

    public void sell(Lease lease) {
        leaseQueue.add(lease);
        trade(lease);
    }
}
