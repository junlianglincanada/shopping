package com.junlianglin.groupon.controller;

import com.junlianglin.groupon.domain.Order;
import com.junlianglin.groupon.domain.Product;
import com.junlianglin.groupon.domain.User;
import com.junlianglin.groupon.service.OrderService;
import com.junlianglin.groupon.service.ProductService;
import com.junlianglin.groupon.support.AbstractController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController extends AbstractController {
    @Autowired
    private ProductService productService;


    @RequestMapping(value="/list", method = RequestMethod.GET)
    public ModelAndView list(){
        ModelAndView modelAndView = new ModelAndView();
        try{
            List<Product> productList = productService.findAll();
            modelAndView.addObject("productList",productList);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        modelAndView.setViewName("/product/list");
        return modelAndView;
    }

    @RequestMapping(value="/create", method = RequestMethod.GET)
    public ModelAndView create(){
        ModelAndView modelAndView = new ModelAndView();
        Product product = new Product();
        modelAndView.addObject("product", product);
        modelAndView.setViewName("/product/create");
        return modelAndView;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ModelAndView create(@Valid Product product, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView();
        if (!bindingResult.hasErrors()){
            this.productService.create(product);
        }
        modelAndView.setViewName("/product/list");
        return modelAndView;
    }
}
