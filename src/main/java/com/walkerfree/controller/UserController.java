package com.walkerfree.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping(value="/{user}", method= RequestMethod.GET)
    public String getUser(@PathVariable Long user, Model model) {
        model.addAttribute("user", user);
        return "user/detail";
    }

    @RequestMapping(value = "/{user}/customers", method = RequestMethod.GET)
    public String getUserCustomers(@PathVariable Long user, Model model) {
        model.addAttribute("user", user);
        return "user/customer";
    }

    @RequestMapping(value="/{user}", method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable Long user, Model model) {
        model.addAttribute("user", user);
        return "user/delete";
    }
}
