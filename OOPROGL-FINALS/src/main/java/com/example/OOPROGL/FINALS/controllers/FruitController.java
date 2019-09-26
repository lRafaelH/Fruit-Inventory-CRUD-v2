package com.example.OOPROGL.FINALS.controllers;

import com.example.OOPROGL.FINALS.model.Fruit;
import com.example.OOPROGL.FINALS.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
public class FruitController {
    @Autowired
    private FruitRepository fruitRepository;

    @GetMapping("/")
    public String getFruit(Model model){
        List<Fruit> listfruits = fruitRepository.findAll();
        Fruit fruit = new Fruit();
        model.addAttribute("listfruits", listfruits);
        model.addAttribute("attrib", fruit);
        return "index";
    }

@PostMapping("/new")

}
