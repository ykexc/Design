import lease.HouseLease;
import lease.Lease;
import mediator.HouseMediator;
import mediator.Mediator;
import rent.HouseRent;
import rent.Rent;

public class Test {


    @org.junit.Test
    public void test() {

        Mediator mediator = new HouseMediator();


        Lease lease = new HouseLease("三室一厅", 200L, mediator); //这儿的设计可以改进
        lease.lease();
        Rent rent = new HouseRent("三室一厅", 100L, mediator);
        rent.rent();
    }

}
