package com.ComIT.CellCity.Controller;

import com.ComIT.CellCity.Model.Mobile.Mobile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.awt.image.ImageObserver;

@Controller
public class AdminController {

    @GetMapping("/admin")
    public String admin() {
//        Mobile mobile;
//        model.addAttribute("mobile", new Mobile());
        return "admin";
    }

    @PostMapping("/admin")
    public String admin(Model model) {
        Mobile mobile;
        model.addAttribute("mobile", new Mobile());
        return "admin";
    }
}
