package aop;

import annotation.AInterceptor;
import com.alibaba.fastjson.JSON;
import config.ConfigService;
import org.apache.commons.beanutils.BeanUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Aspect
@Component
public class Asp {

    @Pointcut("@annotation(annotation.AInterceptor)")
    public void joinPoint() {}

    private static final Logger logger = LoggerFactory.getLogger(Asp.class);

    @Autowired
    private ConfigService configService;


    @Around("joinPoint()")
    public Object point(ProceedingJoinPoint point) throws Throwable {
        logger.info("have running");
        Signature signature = point.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;
        Method method = point
                .getTarget()
                .getClass()
                .getMethod(methodSignature.getName(), methodSignature.getParameterTypes());
        AInterceptor annotation = method.getAnnotation(AInterceptor.class);
        String value = getFiledValue(annotation.key(), point.getArgs());
        if (null == value || value.isEmpty()) return point.proceed();
        String[] limitVal = configService.split(",");
        for (var str : limitVal) {
            if (str.equals(value)) return getRes(annotation, method);
        }
        return point.proceed();
    }

    private Object getRes(AInterceptor annotation, Method method) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> returnType = method.getReturnType();
        String resJson = annotation.retV();
        if ("".equals(resJson)) return returnType.getDeclaredConstructor().newInstance();
        return JSON.parseObject(resJson, returnType);
    }

    private String getFiledValue(String filed, Object[] args) {
        String filedValue = null;
        for (var arg : args) {
            try {
                if (null == filedValue || filedValue.isEmpty()) {
                    filedValue = BeanUtils.getProperty(arg, filed);
                } else break;
            } catch (Exception e) {
                if (args.length == 1) {
                    return args[0].toString();
                }
            }
        }
        return filedValue;
    }


}
