package service;

import awards.Goods;
import req.GoodsReq;
import resp.GoodsResp;

public class GoodsService {


    public GoodsResp sendGoods(
            GoodsReq req
    ) {
        System.out.println("实物奖品发放成功: " + "uid: " + req.uid() + " address: " + req.address());
        return new GoodsResp(req.uid(), req.address(), req.phone(), new Goods("abc", "一本书"));
    }

}
