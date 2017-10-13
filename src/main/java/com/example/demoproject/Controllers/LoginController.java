package com.example.demoproject.Controllers;


import com.example.demoproject.Model.LoginForm;
//import com.example.demoproject.Services. ;
//.Services.AccountServiceImpl;
//import org.slf4j.LoggerFactory;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {

    private final static org.slf4j.Logger LOG = LoggerFactory.getLogger(AccountServiceImpl.class); //TODO create to DAO the Impl.class 

    private static final String LOGIN_FORM = "loginForm";

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, @RequestParam(name = "error", required = false) String error) {
        if (error != null) {
            LOG.error("User not found!");
            model.addAttribute("errorMessage", "User not found! Please try again");
        }
        model.addAttribute(LOGIN_FORM, new LoginForm());
        return "login";
    }


}