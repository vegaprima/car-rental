package com.rental.controllers;

import com.rental.models.Lookup;
import com.rental.services.LookupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by aluckyanto on 11/30/2016.
 */
@Controller
public class LookupController {

    @Autowired
    private LookupService lookupService;

    @RequestMapping(value = "/lookup", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("lookups", lookupService.findAll());
        return "lookup/list";
    }

    @RequestMapping(value = "/lookup/add", method = RequestMethod.GET)
    public String addGet(Model model) {
        model.addAttribute("lookup", new Lookup());
        model.addAttribute("lookupParents", lookupService.findAll());
        return "lookup/add";
    }

    @RequestMapping(value = "/lookup/add", method = RequestMethod.POST)
    public String addPost(@ModelAttribute(value = "lookup") Lookup lookup) {
        lookupService.save(lookup);
        return "redirect:/lookup";
    }

    @RequestMapping(value = "/lookup/edit", method = RequestMethod.GET)
    public String edit(@RequestParam(name = "id") Integer id, Model model) {
        model.addAttribute("lookup", lookupService.findById(id));
        model.addAttribute("lookupParents", lookupService.findByIdNot(id));
        return "lookup/add";
    }

    @RequestMapping(value = "/lookup/delete", method = RequestMethod.GET)
    public String delete(@RequestParam(name = "id") Integer id) {
        lookupService.delete(id);
        return "redirect:/lookup";
    }
}
