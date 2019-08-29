package com.ComIT.CellCity.Controller;

import com.ComIT.CellCity.Model.Mobile.Mobile;
import com.ComIT.CellCity.Model.Mobile.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class AdminController {
    private MobileService mobileService;

    @Autowired
    public AdminController(MobileService mobileService) {
        this.mobileService = mobileService;
    }

    @GetMapping("/admin")
    public String admin(Model model) {
        model.addAttribute("mobile", new Mobile());
        return "admin";
    }

    @PostMapping("/admin")
    public String admin(@ModelAttribute Mobile mobile) {
        mobileService.saveMobile(mobile);
        return "admin";
    }

}
