package com.ComIT.CellCity.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CellCityController {

    @GetMapping("/index")
    public String HomePage() {
        return "index";
    }
    @GetMapping("/checkout")
    public String CheckoutPage() {
        return "checkout";
    }
    @GetMapping("/cart")
    public String CartPage() {
        return "cart";
    }
    @GetMapping("/shop")
    public String ShopPage() {
        return "shop";
    }
}
