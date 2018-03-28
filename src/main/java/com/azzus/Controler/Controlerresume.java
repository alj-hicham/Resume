package com.azzus.Controler;

import com.azzus.Repo.GeneralinfoRepo;
import com.azzus.Repo.UserResumerepo;
import com.azzus.domain.Generalinfo;
import com.azzus.domain.Userresume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class Controlerresume {
    @Autowired
    private GeneralinfoRepo generalinfoRepo;
    @Autowired
    private UserResumerepo userResumerepo;


    @RequestMapping(value = "/index/{id}/confirm", method = RequestMethod.GET)
    public String showbyid(@PathVariable Long id, Model model) {
        model.addAttribute("generalinfo", generalinfoRepo.getOne(id));
        model.addAttribute("userresume", userResumerepo.getOne(id));

        return "confirm";
    }

    @RequestMapping(value = "/cv", method = RequestMethod.POST)
    public String showingcv(@Valid Generalinfo generalinfo) {
        generalinfoRepo.save(generalinfo);

        return "yourcv";
    }

    @RequestMapping(value = "/index/{id}/edit", method = RequestMethod.GET)
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("generalinfo", generalinfoRepo.findById(id));
        return "edit";
    }
/*  @RequestMapping(value="/cv",method=RequestMethod.POST, params = "action=edit")
public String edit(Model model , Generalinfo generalinfo, Long id){
      model.addAttribute()
} */
/*
    @RequestMapping(value="/index/confirming", method=RequestMethod.GET)
public String gettingcv (){

return "redirect:/cv";
    }
*/

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String gettingform(Model model) {
        model.addAttribute("generalinfo", new Generalinfo());
        model.addAttribute("userresume", new Userresume());
        return "forminput";
    }


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveorupdate(@Valid Generalinfo generalinfoo, @Valid Userresume userresume, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "forminput";
        } else {
            Generalinfo generalinfo = generalinfoRepo.save(generalinfoo);
            userResumerepo.save(userresume);

            return "redirect:/index/" + generalinfo.getGeneral_id() + "/confirm";

        }


    }

}
