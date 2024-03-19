package app.controller;


import app.entity.Res;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ykexc.work.starter.annotation.AInterceptor;
import ykexc.work.starter.aop.Asp;
import ykexc.work.starter.config.ConfigService;

import javax.annotation.Resource;


@RestController
public class MainController {


    @Resource
    private ConfigService configService;


    @GetMapping("/hello")
    @AInterceptor(key = "userId", retV = """
                    "name": "xixi",
                    "age": 18
            """)
    public Res hello(@RequestParam String userId) {
        return new Res("xiaoxiao", 13);
    }




}
