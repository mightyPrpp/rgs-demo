package com.example.demoproject.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SampleSecurityController {


    @RequestMapping(value = "/adminPage", method = RequestMethod.GET)
    public String adminPage(Model model) {

        return "admin";
    }

    @RequestMapping(value = "/userPage", method = RequestMethod.GET)
    public String userPage(Model model) {

        return "user";
    }

}
