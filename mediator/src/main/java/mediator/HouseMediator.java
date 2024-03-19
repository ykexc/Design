package mediator;

import lease.Lease;
import rent.Rent;

import java.util.Iterator;

public class HouseMediator extends Mediator{
    @Override
    protected void trade(Lease lease) {

        Iterator<Rent> iterator = Mediator.rentQueue.iterator();
        while (iterator.hasNext()) {
            var r = iterator.next();
            if (r.getName().equals(lease.getName()) && r.getMoney() >= lease.getMoney()) {
                System.out.println("双方交易成功");
                iterator.remove();
                return;
            }
        }
        System.out.println("暂无买家");
    }

    @Override
    protected void trade(Rent rent) {
        Iterator<Lease> iterator = Mediator.leaseQueue.iterator();
        while (iterator.hasNext()) {
            var l = iterator.next();
            if (l.getName().equals(rent.getName()) && rent.getMoney() >= l.getMoney()) {
                System.out.println("双方交易成功");
                iterator.remove();
                return;
            }
        }
        System.out.println("暂无卖家");
    }
}
