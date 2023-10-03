package edu.pe.cibertec.clientes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"/inicio","/","/home","/index"})

    public String index(){
    return "home";
    }
}
