package store.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import service.IQIYICardService;
import store.ICommodity;

import java.util.Map;

public class OtherCommodityImpl implements ICommodity {


    IQIYICardService iqiyiCardService = new IQIYICardService();

    Logger logger = LoggerFactory.getLogger(OtherCommodityImpl.class);

    @Override
    public void sendCommodity(Map<String, String> param) {
        iqiyiCardService.grantToken(param.get("uid"), param.get("bindMobileNumber"));
        logger.info("发送爱奇艺月卡成功");
    }
}
