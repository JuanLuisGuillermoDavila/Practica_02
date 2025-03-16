package com.upiiz.practica.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";  // Devuelve el archivo index.html
    }

    @PostMapping("/saludar")
    public String saludar(@RequestParam("nombre") String nombre, Model model) {
        model.addAttribute("mensaje", "Hola, " + nombre + "!");
        return "index";  // Redirige de nuevo a index.html
    }
}
