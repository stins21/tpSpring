package com.testopa.testopa.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class SellerController {

    @GetMapping(value = "/name")
    public String index(HttpServletRequest req) {
        return "index.html";
    }
}
