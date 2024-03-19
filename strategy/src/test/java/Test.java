import strategy.impl.DiscountStrategy;
import strategy.impl.FullReductionStrategy;
import strategy.service.ShopService;

public class Test {



    @org.junit.Test
    public void test() {
        ShopService service = new ShopService(new DiscountStrategy(0.5));
        System.out.println(service.calculatePrice(100.0));
        service = new ShopService(new FullReductionStrategy());
        System.out.println(service.calculatePrice(1200.0));
    }

}
