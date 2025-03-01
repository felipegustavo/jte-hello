package edu.ifba.hello.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.ifba.hello.dto.Page;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        var items = List.of("Item 1", "Item 2", "Item 3");
        model.addAttribute("items", items);
        return "index"; 
    }

    @GetMapping("/outra")
    public String outra(Model model) {
        var page = new Page("Outra Página");
        model.addAttribute("page", page);
        return "outra";
    }

}
