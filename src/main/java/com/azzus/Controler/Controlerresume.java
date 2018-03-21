package com.azzus.Controler;

import com.azzus.Repo.GeneralinfoRepo;
import com.azzus.domain.Generalinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class Controlerresume {
    @Autowired
    private GeneralinfoRepo generalinfoRepo;

    @GetMapping
    @RequestMapping("/index/{id}/confirm")
    public String showbyid(@PathVariable Long id, Model model) {
        model.addAttribute("generalinfo", generalinfoRepo.getOne(id));


        return "confirm";
    }

    @GetMapping
    @RequestMapping(value = "/form")
    public String gettingform(Model model) {
        model.addAttribute("generalinfo", new Generalinfo());
        return "index";
    }


    @PostMapping
    @RequestMapping(value = "/save")
    public String saveorupdate(@Valid Generalinfo generalinfoo, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "index";
        } else {
            Generalinfo generalinfo = generalinfoRepo.save(generalinfoo);

            return "redirect:/index/" + generalinfo.getGeneral_id() + "/confirm";
        }
    }

    @PostMapping(value = "/confirm")
    public String confirming(Generalinfo generalinfo) {
        generalinfoRepo.save(generalinfo);
        return "yourcv";
    }
}
