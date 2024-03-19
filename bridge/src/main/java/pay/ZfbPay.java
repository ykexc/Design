package pay;

import java.math.BigDecimal;

public class ZfbPay extends Pay{


    public ZfbPay(IPayMode payMode) {
        super(payMode);
    }

    @Override
    public String trade(String uid, String tradeId, BigDecimal amount) {
        logger.info("模拟支付宝渠道支付划账开始。uId：{} tradeId：{} amount：{}", uid, tradeId, amount);
        boolean isSecurity = this.payMode.checkSecurity(uid);
        logger.info("校验成功， 成功支付");
        return "0x00000000000";
    }
}
