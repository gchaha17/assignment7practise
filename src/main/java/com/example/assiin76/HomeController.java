package com.example.assiin76;

import com.example.assiin76.model.Inquiry;
import com.example.assiin76.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class HomeController {


    @GetMapping("/index")
    public String index(Model model)
    {
model.addAttribute("inquiry",new Inquiry());
        return "index";
    }


    @GetMapping("/form")
    public String forms()
    {
        return "form";

    }


    @GetMapping("/elements")
    public String elements()
    {
        return "elements";

    }

    @Autowired
    private GenericService g22;

    @GetMapping("/generic")
    public String generic(Model model)
    {

        model.addAttribute("g1",g22.getGenerics());


        return "generic";

    }


    @PostMapping ("/generic")
    public String genericSearch(Model model,@ModelAttribute Inquiry inquiry)
    {
model.addAttribute("inquiry",inquiry);
        String genericname=inquiry.getSearch1();
        model.addAttribute("g1",g22.searchGenerics(genericname));


        return "generic";

    }
}