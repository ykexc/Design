package sb.controller.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import sb.controller.decorator.InterceptorDecorator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainEnhanceInterceptor extends InterceptorDecorator {
    public MainEnhanceInterceptor(HandlerInterceptor handlerInterceptor) {
        super(handlerInterceptor);
    }


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        boolean handle = super.preHandle(request, response, handler);
        if (!handle) return false;
        return request.getHeader("B").equals("b");
    }
}
