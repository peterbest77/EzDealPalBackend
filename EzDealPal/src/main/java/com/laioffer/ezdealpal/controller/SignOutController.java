package com.laioffer.ezdealpal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

// https://blog.csdn.net/qq_34626094/article/details/122640679
@Controller
public class SignOutController {
    @RequestMapping(value = "/logout")
    public String logout(HttpSession session) {
        session.removeAttribute("user");
        session.invalidate();
        return "redirect:/login";
    }
}
