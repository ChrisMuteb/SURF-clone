package org.gouv.finances.surf.demo.controller;

import org.gouv.finances.surf.demo.entite.Commune;
import org.gouv.finances.surf.demo.entite.Departement;
import org.gouv.finances.surf.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DemoController {
    @Autowired
    private final DemoService demoService;

    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }


    @GetMapping("/")
    public String welcome(Model model)
    {
        return "index";
    }

    @GetMapping("/greetings")
    public String greetings(Model model){
        List<Departement> departements = demoService.getDepartements();
        List<Commune> communes = demoService.getCommunes();
        model.addAttribute("allDepts", departements);
        model.addAttribute("allComs", communes);
        return "rechercheFiche";
    }

    @GetMapping("/consultation")
    public String consultation(){
        return "generaliteFiche";
    }

    @GetMapping("/modification")
    public String modification(){
        return  "modifierFiche";
    }
}
