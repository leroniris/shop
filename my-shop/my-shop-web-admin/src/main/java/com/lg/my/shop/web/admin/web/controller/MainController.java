package com.lg.my.shop.web.admin.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Leron
 * @version 1.0.0
 * @create 2019/12/7 14:07
 */
@Controller
public class MainController {

    /**
     * 跳转到首页
     * @return
     */
    @RequestMapping(value = "main", method = RequestMethod.GET)
    public String main() {
        return "main";
    }
}
