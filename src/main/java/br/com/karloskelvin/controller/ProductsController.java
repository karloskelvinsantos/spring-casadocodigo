package br.com.karloskelvin.controller;

import br.com.karloskelvin.daos.ProductDAO;
import br.com.karloskelvin.models.BookType;
import br.com.karloskelvin.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.transaction.Transactional;

@Controller
@Transactional
public class ProductsController {

  @Autowired
  ProductDAO dao;

  @RequestMapping("/produtos/form")
  public ModelAndView form(){
    ModelAndView modelAndView = new ModelAndView("/products/form");
    modelAndView.addObject("types", BookType.values());
    return modelAndView;
  }

  @RequestMapping(value = "/produtos", method = RequestMethod.POST)
  public String save(Product product){
    System.out.println("Cadastrando o Produto " + product);
    dao.save(product);
    return "products/ok";
  }

  @RequestMapping(value = "/produtos", method = RequestMethod.GET)
  public ModelAndView list() {
    ModelAndView modelAndView = new ModelAndView("/products/list");
    modelAndView.addObject("products", dao.list());
    return modelAndView;
  }
}
