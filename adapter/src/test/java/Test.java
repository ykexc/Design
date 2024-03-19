import action.impl.Ac1Impl;
import action.impl.Ac2Impl;
import com.alibaba.fastjson2.JSON;
import parameter.ParameterAdapter;
import parameter.e.M;
import parameter.e.M1;
import parameter.e.M2;

import java.lang.reflect.InvocationTargetException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Map;

public class Test {


    @org.junit.Test
    public void test01() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        M1 m1 = new M1("000111", "0101", LocalDateTime.now());
        Map<String, ?> obj = Map.of("orderId" ,m1.orderId(), "uid", m1.uid(), "date", locateDate2Date(m1.date()));
        Map<String, String> keyValue1 = Map.of("orderId", "orderId", "uid", "userId", "date", "date");
        M m1Adapter = ParameterAdapter.adapter(JSON.toJSONString(obj), keyValue1);
        System.out.println(m1Adapter);


        M2 m2 = new M2("000222", "0202", new Date());
        Map<String, String> keyValue2 = Map.of("skuId", "orderId", "userId", "userId", "date", "date");
        M m2Adapter = ParameterAdapter.adapter(JSON.toJSONString(m2), keyValue2);
        System.out.println(m2Adapter);
    }


    private Date locateDate2Date(LocalDateTime dateTime) {
        Instant instant = dateTime.atZone(ZoneId.systemDefault()).toInstant();
        return Date.from(instant);
    }


    @org.junit.Test
    public void test02() {
        Ac1Impl ac1 = new Ac1Impl();
        ac1.hello("hello", "world");
        Ac2Impl ac2 = new Ac2Impl();
        ac2.hello("hello", "world");
    }

}
