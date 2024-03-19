package store.impl;

import com.alibaba.fastjson2.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import req.GoodsReq;
import resp.GoodsResp;
import service.GoodsService;
import store.ICommodity;

import java.util.Map;

public class GoodsCommodityImpl implements ICommodity {

    Logger logger = LoggerFactory.getLogger(GoodsCommodityImpl.class);

    GoodsService goodsService = new GoodsService();
    @Override
    public void sendCommodity(Map<String, String> param) {
        GoodsResp goodsResp = goodsService.sendGoods(JSON.parseObject(param.get("goodsReq"), GoodsReq.class));
        logger.info("实物发放成功, {}: {} :{}", goodsResp.uid(), goodsResp.goods(), goodsResp.address());
    }
}
