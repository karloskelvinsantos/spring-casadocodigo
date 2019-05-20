package br.com.karloskelvin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public  String index(){
        System.out.println("Carregando Produtos");
        return "hello-world";
    }
}
