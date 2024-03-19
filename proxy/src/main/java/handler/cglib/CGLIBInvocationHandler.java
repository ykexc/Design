package handler.cglib;

import annotation.Select;
import org.springframework.cglib.proxy.InvocationHandler;


import java.lang.reflect.Method;

public class CGLIBInvocationHandler implements InvocationHandler {

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        Select annotation = method.getAnnotation(Select.class);
        String value = annotation.value();
        return value + objects[0];
    }
}
