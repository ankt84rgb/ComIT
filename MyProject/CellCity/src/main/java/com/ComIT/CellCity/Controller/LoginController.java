package com.ComIT.CellCity.Controller;

import com.ComIT.CellCity.Model.Mobile;
import com.ComIT.CellCity.Model.Person;
import com.ComIT.CellCity.Service.LoginRepository;
import com.ComIT.CellCity.Service.LoginService;
import com.ComIT.CellCity.Service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    private LoginService loginService;
    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping("login")
    public String login(Model model) {
        return "login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute Person person) {
        return "login";
    }

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("person", new Person());
        return "register";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute Person person) {
        loginService.savePerson(person);
        return "register";
    }
}


