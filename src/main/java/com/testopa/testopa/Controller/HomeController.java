package com.testopa.testopa.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController extends HttpServlet{

    @GetMapping(value = "/")
    public String index(HttpServletRequest req){
        return "index.html";
    }

    @GetMapping(value = "/newVendor")
    public String newVendor(){
        return "newVendor.html";
    }

    @GetMapping(value = "/saveVendor")
    public String saveVendor(){
        return "saveVendor.html";
    }
}
