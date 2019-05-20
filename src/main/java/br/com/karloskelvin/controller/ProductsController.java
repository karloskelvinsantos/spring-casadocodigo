package br.com.karloskelvin.controller;

import br.com.karloskelvin.daos.ProductDAO;
import br.com.karloskelvin.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.transaction.Transactional;

@Controller
@Transactional
public class ProductsController {

    @Autowired
    ProductDAO dao;

    @RequestMapping("/produtos/form")
    public String form(){
        return "products/form";
    }

    @RequestMapping("/produtos")
    public String save(Product product){
        System.out.println("Cadastrando o Produto " + product);
        dao.save(product);
        return "products/ok";
    }
}
