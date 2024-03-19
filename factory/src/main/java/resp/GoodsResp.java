package resp;

import awards.Goods;

public record GoodsResp(

        String uid,

        String address,

        String phone,

        Goods goods
) {
}
