package com.myt.zpp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description： TODO
 * @Author: meiyt
 * @Date: Created in 2021/12/17
 */
@RestController
@RequestMapping("/login")
public class LoginController {

    @RequestMapping("/account")
    public String accountLogin() {
        return "成功！！！";
    }
}
