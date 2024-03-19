package handler.jdk;

import annotation.Select;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.*;

public class JDKInvocationHandler implements InvocationHandler {


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Select annotation = method.getAnnotation(Select.class);
        String value = annotation.value();
        return value + args[0];
    }
}
