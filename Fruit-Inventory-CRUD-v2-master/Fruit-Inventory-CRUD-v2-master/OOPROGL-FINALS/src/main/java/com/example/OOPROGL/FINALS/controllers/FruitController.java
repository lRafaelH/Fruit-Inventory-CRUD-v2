package com.example.OOPROGL.FINALS.controllers;

import com.example.OOPROGL.FINALS.model.Fruit;
import com.example.OOPROGL.FINALS.repository.FruitRepository;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.PublicKey;
import java.util.List;

@Controller
public class FruitController {

    @Autowired
    private FruitRepository fruitRepository;

    @GetMapping("/fruit")
    public String getFruit(Model model){
        List<Fruit> listfruits = fruitRepository.findAll();
        Fruit fruit = new Fruit();
        model.addAttribute("listFruits", listfruits);
        model.addAttribute("Attrib",fruit);
        return "index";
    }

    @GetMapping("/fruit/get")
    public String newFruit(Model model) {
        List<Fruit> listfruits = fruitRepository.findAll();
        Fruit fruit = new Fruit();
        model.addAttribute("listFruits", listfruits);
        model.addAttribute("Attrib", fruit);
        return "new_fruit";

    }
        @PostMapping("/fruit/new")
        public String addAction(@ModelAttribute("listFruits") Fruit newFruit ){
        fruitRepository.save(newFruit);
        return "redirect:/fruit";
        }

//        @GetMapping("/fruit/{id}")
//        public String editFruit(@PathVariable )


//        @GetMapping("/{id}")
//        public String gets(@PathVariable Long id, Model model){
//        model.addAttribute("quas",fruitRepository.getOne(id));
//        return "/";
//        }
    }

