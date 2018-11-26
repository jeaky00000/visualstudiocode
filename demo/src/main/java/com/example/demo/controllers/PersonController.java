package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/person")
public class PersonController{
    @GetMapping("all")
    public String findAllPerson(Model model){
        model.addAttribute("user_name", "jiang  yanping");
        model.addAttribute("age", 30);
        List user_list = Arrays.asList("zhai", "zhang", "chen", "liu");
        model.addAttribute("user_list", user_list);


        return "person/all";
    }
}