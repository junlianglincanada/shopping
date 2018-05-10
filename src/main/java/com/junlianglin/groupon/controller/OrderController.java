package com.junlianglin.groupon.controller;

import com.junlianglin.groupon.domain.Order;
import com.junlianglin.groupon.service.OrderService;
import com.junlianglin.groupon.support.AbstractController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController extends AbstractController {

    @Autowired
    private OrderService orderService;


    @RequestMapping(value="/list", method = RequestMethod.GET)
    public ModelAndView registration(){
        ModelAndView modelAndView = new ModelAndView();
        try{
            List<Order> orderList = orderService.findAll();

            //Page<Order> orderList = orderService.findAllByCreateDateAsc(null,1,10);
            System.out.println("size=" + orderList.size());
            modelAndView.addObject("orderList",orderList);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        modelAndView.setViewName("/order/list");
        return modelAndView;
    }

}
