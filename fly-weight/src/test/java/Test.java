import dy.RedisUtil;
import im.QueryFactory;
import re.Shop;

public class Test {


    @org.junit.Test
    public void test() throws InterruptedException {
        for (int i = 0; i < 30; i++) {
            Shop shop = QueryFactory.get(1);
            Integer stock = RedisUtil.getStock(1);
            shop.setStock(stock);
            System.out.println(shop);
            Thread.sleep(3000);
        }
    }

}
