import sell.Sell;
import sell.SellImpl;

public class Test {


    @org.junit.Test
    public void test() {
        Sell sell = new SellImpl();
        sell.sell(1L);
    }

}
