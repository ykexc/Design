package sb.controller.decorator;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class InterceptorDecorator implements HandlerInterceptor {

    protected HandlerInterceptor handlerInterceptor;

    protected InterceptorDecorator(HandlerInterceptor handlerInterceptor) {
        this.handlerInterceptor = handlerInterceptor;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return this.handlerInterceptor.preHandle(request, response, handler);
    }
}
