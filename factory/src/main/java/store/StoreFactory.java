package store;


import store.impl.CouponCommodityImpl;
import store.impl.GoodsCommodityImpl;
import store.impl.OtherCommodityImpl;

public class StoreFactory {

    GoodsCommodityImpl goodsCommodity;
    CouponCommodityImpl couponCommodity;

    OtherCommodityImpl otherCommodity;

    public StoreFactory() {
        goodsCommodity = new GoodsCommodityImpl();
        couponCommodity = new CouponCommodityImpl();
        otherCommodity = new OtherCommodityImpl();
    }

    public ICommodity getCommodity(Integer commodityType) throws IllegalAccessException {
        if (null == commodityType) return null;
        if (commodityType.equals(1)) return goodsCommodity;
        if (commodityType.equals(2)) return couponCommodity;
        if (commodityType.equals(3)) return otherCommodity;
        throw new IllegalAccessException("错误的类型");
    }

}
