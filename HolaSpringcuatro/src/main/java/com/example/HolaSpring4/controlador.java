package com.example.HolaSpring4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class controlador {
    
    @GetMapping("/hola")
    public String saludar(){
        return "<h1>Hola grupo 42</h1>";
    }
}
