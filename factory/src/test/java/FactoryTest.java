import com.alibaba.fastjson2.JSON;
import org.junit.Test;
import req.GoodsReq;
import store.ICommodity;
import store.StoreFactory;

import java.util.Map;

public class FactoryTest {


    StoreFactory storeFactory = new StoreFactory();

    @Test
    public void test() throws IllegalAccessException {
        ICommodity commodity1 = storeFactory.getCommodity(1);

        commodity1.sendCommodity(Map.of("goodsReq", JSON.toJSONString(new GoodsReq("012", "陕西省咸阳市", "15229602984"))));

        ICommodity commodity2 = storeFactory.getCommodity(2);

        commodity2.sendCommodity(Map.of("uid", "124", "couponId", "2344", "uuid", "sdfd23453"));

        ICommodity commodity3 = storeFactory.getCommodity(3);

        commodity3.sendCommodity(Map.of("bindMobileNumber", "sdssfdff233", "uid", "4554"));
    }

}
