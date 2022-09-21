package com.example.HolaSpring2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class Controlador {
    
    @GetMapping("/hola")
    public String saludar(){
        return "<h1>Hola Grupo</h1>";
    }
}
