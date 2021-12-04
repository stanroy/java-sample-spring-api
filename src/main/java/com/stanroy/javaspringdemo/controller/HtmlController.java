package com.stanroy.javaspringdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HtmlController {


    @GetMapping("/")
    String blog(Model model) {
        model.addAttribute("title", "DummyTitle");
        model.addAttribute("banner", "DummyBanner");
        model.addAttribute("articles", "DummyArticle");
        return "blog";
    }


    @GetMapping("/error")
    public String error() {
        return "error";
    }


}
