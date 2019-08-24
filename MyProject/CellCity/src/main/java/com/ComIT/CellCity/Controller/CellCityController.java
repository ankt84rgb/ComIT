package com.ComIT.CellCity.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CellCityController {

    @GetMapping("/index")
    public String HomePage() {
        return "index";
    }

}
