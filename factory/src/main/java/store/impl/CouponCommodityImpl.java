package store.impl;

import awards.Coupon;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import service.CouponService;
import store.ICommodity;

import java.util.Map;


public class CouponCommodityImpl implements ICommodity {

    CouponService couponService = new CouponService();

    Logger logger = LoggerFactory.getLogger(CouponCommodityImpl.class);

    @Override
    public void sendCommodity(Map<String, String> param) {
        Coupon coupon = couponService.sendCoupon(param.get("uid"), param.get("couponId"), param.get("uuid"));
        logger.info("优惠券发放成功: {}: {}", coupon.cardId(), coupon.info());
    }
}
