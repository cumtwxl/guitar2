package com.example.demo.controller;

import com.example.demo.dao.GuitarDao;
import com.example.demo.entity.Guitar;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GuitarController {

    @Autowired
    private GuitarDao guitarDao;

    @GetMapping("/")
    public String findAll(Model model){
        model.addAttribute("list",guitarDao.findAll());
        return "list";
    }
    @PostMapping("/add")
    public String addGuitar(Guitar guitar){
        guitarDao.save(guitar);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteById(@PathVariable Integer id){
        guitarDao.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/findByName")
    public String findByName(String name, Model model){
        model.addAttribute("list",guitarDao.findByName(name));
        return "list";
    }
}
