package com.rental.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by aluckyanto on 11/20/2016.
 */
@Controller
public class UnitController {

    @RequestMapping(value = "/car", method = RequestMethod.GET)
    public ModelAndView hello(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("car/list");
        return modelAndView;
    }
}
