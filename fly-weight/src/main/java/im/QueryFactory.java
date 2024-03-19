package im;

import re.Shop;

import java.util.concurrent.ConcurrentHashMap;

public class QueryFactory {

    public static final ConcurrentHashMap<Integer, Shop> map = new ConcurrentHashMap<>();

    public static Shop get(Integer id) {
        if (map.containsKey(id)) return map.get(id);
        Shop shop = new Shop(id, "xx", null);
        map.put(id, shop);
        return shop;
    }

}
