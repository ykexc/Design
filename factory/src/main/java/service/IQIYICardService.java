package service;

import awards.IQIYICard;

public class IQIYICardService {


    public void grantToken(String uid, String bindMobileNumber) {
        System.out.println("模拟发放爱奇艺会员卡一张：" + bindMobileNumber + "，" + new IQIYICard("0x3f3f3f3f"));
    }

}
