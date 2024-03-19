package parameter;
import com.alibaba.fastjson2.JSON;
import parameter.e.M;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class ParameterAdapter {


    public static M adapter(String jsonStr, Map<String, String> keyValue) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        Map<?, ?> map = JSON.parseObject(jsonStr, Map.class);
        return adapter(map, keyValue);
    }


    public static M adapter(Map<?, ?> obj, Map<String, String> keyValue) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        M m = new M();
        for (var e : keyValue.entrySet()) {
            var val = obj.get(e.getKey());
            String value = e.getValue();
            String methodName = "set" + value.substring(0, 1).toUpperCase() + value.substring(1);
            M.class.getMethod(methodName, String.class).invoke(m, val.toString());
        }
        return m;
    }

}
