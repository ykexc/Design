package pay;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

public abstract class Pay {

    protected Logger logger = LoggerFactory.getLogger(Pay.class);
    protected IPayMode payMode;

    public Pay(IPayMode payMode) {
        this.payMode = payMode;
    }

    protected abstract String trade(String uid, String tradeId, BigDecimal amount);

}
