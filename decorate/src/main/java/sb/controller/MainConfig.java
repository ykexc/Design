package sb.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import sb.controller.interceptor.MainEnhanceInterceptor;
import sb.controller.interceptor.MainInterceptor;

@Configuration
public class MainConfig implements WebMvcConfigurer {


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MainEnhanceInterceptor(new MainInterceptor())).addPathPatterns("/**");
    }
}
