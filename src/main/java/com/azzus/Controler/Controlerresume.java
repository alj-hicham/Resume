package com.azzus.Controler;

import com.azzus.Services.Generalinforepo;
import com.azzus.domain.Generalinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class Controlerresume {

    @Autowired
    private Generalinforepo generalinforepo;


    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String formResume(Model model) {
        model.addAttribute("generalinfo", new Generalinfo());

        return "index";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String addGeneralinfo(Model model, @Valid Generalinfo generalinfo, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "index";
        } else {
            generalinforepo.save(generalinfo);
            return "confirm";
        }
    }
}
