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
    public String list(){
        return "car/list";
    }

    @RequestMapping(value = "/car/add", method = RequestMethod.GET)
    public String add(){
        return "car/add";
    }
}
