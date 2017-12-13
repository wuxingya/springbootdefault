package com.springbootdefault.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/12/13.
 */
@Slf4j
@Controller("/")
public class UserController {
    @RequestMapping("/name")
    public String setUserName(){
        log.info("啦啦啦啦啦啦啦啦啦啦啦");
        log.info("啦啦啦啦啦啦啦啦啦啦啦");
        log.info("啦啦啦啦啦啦啦啦啦啦啦");
        log.info("啦啦啦啦啦啦啦啦啦啦啦");
        return "user/hello";
    }
}
