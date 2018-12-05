package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;

import org.hibernate.annotations.SourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/person")
public class PersonController {

    @Autowired
    UserRepository respository;


    @GetMapping("all")
    public String findAllPerson(Model model) {
        model.addAttribute("user_name", "jiang  yanping");
        model.addAttribute("age", 30);
        List user_list = Arrays.asList("zhai", "zhang", "chen", "liu", "xiaofang","xiaoli");
        model.addAttribute("user_list", user_list);

        return "person/all";
    }

    @GetMapping("find")
    @ResponseBody
    public List<User> find(){
        List<User>  users =  respository.findAll();
       
        return users;
    }

    @GetMapping("add")
    @ResponseBody
    public String add(){
        User user = new User("chen");
        respository.save(user);
    
        return "ok";
    }

}