import pay.WxPay;
import pay.ZfbPay;
import pay.impl.CyPayMode;
import pay.impl.FacePayMode;

import java.math.BigDecimal;

public class Test {


    @org.junit.Test
    public void test() {
        WxPay wxPay = new WxPay(new CyPayMode());
        wxPay.trade("7878", "99999", BigDecimal.ONE);
        ZfbPay zfbPay = new ZfbPay(new FacePayMode());
        zfbPay.trade("7979", "78888", BigDecimal.TEN);
    }

}
