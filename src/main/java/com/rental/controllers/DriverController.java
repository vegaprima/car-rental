package com.rental.controllers;

import com.rental.models.Driver;
import com.rental.others.Constants;
import com.rental.services.DriverService;
import com.rental.services.LookupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by aluckyanto on 12/3/2016.
 */
@Controller
public class DriverController {

    @Autowired
    private DriverService driverService;

    @Autowired
    private LookupService lookupService;

    @RequestMapping(value = "/driver", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("drivers", driverService.findAll());
        return "driver/list";
    }

    @RequestMapping(value = "/driver/add", method = RequestMethod.GET)
    public String addGet(Model model) {
        model.addAttribute("driver", new Driver());
        model.addAttribute("lookupGenders", lookupService.findByCodeIgnoreCase(Constants.Lookup.GENDER));
        model.addAttribute("lookupLicenseTypes", lookupService.findByCodeIgnoreCase(Constants.Lookup.DRIVER_LICENSE_TYPE));
        model.addAttribute("lookupProvinces", lookupService.findByCodeIgnoreCase(Constants.Lookup.PROVINCE));
        model.addAttribute("lookupCities", lookupService.findByCodeIgnoreCase(Constants.Lookup.CITY));
        model.addAttribute("lookupStatuses", lookupService.findByCodeIgnoreCase(Constants.Lookup.DRIVER_STATUS));
        return "driver/add";
    }

    @RequestMapping(value = "/driver/add", method = RequestMethod.POST)
    public String addPost(@ModelAttribute(value = "driver") Driver driver) {
        driverService.save(driver);
        return "redirect:/driver";
    }

    @RequestMapping(value = "/driver/edit", method = RequestMethod.GET)
    public String edit(@RequestParam(name = "id") Integer id, Model model) {
        model.addAttribute("driver", driverService.findById(id));
        model.addAttribute("lookupGenders", lookupService.findByCodeIgnoreCase(Constants.Lookup.GENDER));
        model.addAttribute("lookupLicenseTypes", lookupService.findByCodeIgnoreCase(Constants.Lookup.DRIVER_LICENSE_TYPE));
        model.addAttribute("lookupProvinces", lookupService.findByCodeIgnoreCase(Constants.Lookup.PROVINCE));
        model.addAttribute("lookupCities", lookupService.findByCodeIgnoreCase(Constants.Lookup.CITY));
        model.addAttribute("lookupStatuses", lookupService.findByCodeIgnoreCase(Constants.Lookup.DRIVER_STATUS));
        return "driver/add";
    }

    @RequestMapping(value = "/driver/delete", method = RequestMethod.GET)
    public String delete(@RequestParam(name = "id") Integer id) {
        driverService.delete(id);
        return "redirect:/driver";
    }
}