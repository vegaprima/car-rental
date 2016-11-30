package com.rental.controllers;

import com.rental.models.Unit;
import com.rental.other.Constants;
import com.rental.services.LookupService;
import com.rental.services.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by aluckyanto on 11/20/2016.
 */
@Controller
public class UnitController {

    @Autowired
    private UnitService unitService;

    @Autowired
    private LookupService lookupService;

    @RequestMapping(value = "/unit", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("units", unitService.unitFindAll());
        return "unit/list";
    }

    @RequestMapping(value = "/unit/add", method = RequestMethod.GET)
    public String addGet(Model model) {
        model.addAttribute("unit", new Unit());
        model.addAttribute("lookupBrands", lookupService.findByCodeIgnoreCase(Constants.Lookup.UNIT_BRANDS));
        model.addAttribute("lookupTypes", lookupService.findByCodeIgnoreCase(Constants.Lookup.UNIT_TYPES));
        model.addAttribute("lookupTrans", lookupService.findByCodeIgnoreCase(Constants.Lookup.UNIT_TRANS));
        return "unit/add";
    }

    @RequestMapping(value = "/unit/add", method = RequestMethod.POST)
    public String addPost(@ModelAttribute(value = "unit") Unit unit) {
        unitService.unitSave(unit);
        return "redirect:/unit";
    }

    @RequestMapping(value = "/unit/edit", method = RequestMethod.GET)
    public String edit(@RequestParam(name = "id") Integer id, Model model) {
        model.addAttribute("unit", unitService.unitFindById(id));
        model.addAttribute("lookupBrands", lookupService.findByCodeIgnoreCase(Constants.Lookup.UNIT_BRANDS));
        model.addAttribute("lookupTypes", lookupService.findByCodeIgnoreCase(Constants.Lookup.UNIT_TYPES));
        model.addAttribute("lookupTrans", lookupService.findByCodeIgnoreCase(Constants.Lookup.UNIT_TRANS));
        return "unit/add";
    }

    @RequestMapping(value = "/unit/delete", method = RequestMethod.GET)
    public String delete(@RequestParam(name = "id") Integer id) {
        unitService.unitDelete(id);
        return "redirect:/unit";
    }
}
