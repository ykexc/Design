package service;

import awards.Coupon;

public class CouponService {

    public Coupon sendCoupon(String uid, String couponId, String uuid) {
        System.out.println("发送优惠券成功: uid: " + uid + " couponId: " + couponId + " uid: " + uid);
        return new Coupon("0x3f3f3f3f", "普通优惠券");
    }

}
