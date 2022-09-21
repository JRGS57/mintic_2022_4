package com.example.HolaSpring5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class controlador {
    
    @GetMapping("/hola")
    public String saludar(){
        return "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "  <title>Ejemplo de JavaScript</title>\n" +
                "  <meta charset=\"UTF-8\">\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "<script>\n" +
                "  document.write('Hola Grupo mintic2022');\n" +
                "</script>\n" +
                "\n" +
                "</body>\n" +
                "</html>";
    }
    
    @GetMapping("/form")
    public String formu(){
        return "<!DOCTYPE html>\n" +
                "<html>\n" +
                "\n" +
                "<head>\n" +
                "    <title>Ejemplo de JavaScript</title>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "</head>\n" +
                "\n" +
                "<body>\n" +
                "\n" +
                "    <form>\n" +
                "        <input type=\"button\" onClick=\"incrementar()\" value=\"incrementar\">\n" +
                "    </form>\n" +
                "\n" +
                "    <script>\n" +
                "        let contador = 0;\n" +
                "\n" +
                "        function incrementar() {\n" +
                "            contador++;\n" +
                "            alert('El contador ahora vale :' + contador);\n" +
                "        }\n" +
                "    </script>\n" +
                "\n" +
                "</body>\n" +
                "\n" +
                "</html>";
    }
    
    @GetMapping("/boton")
    public String botones(){
        return "<!DOCTYPE html>\n" +
                "<html>\n" +
                "\n" +
                "<head>\n" +
                "    <title>Ejemplo de JavaScript</title>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "</head>\n" +
                "\n" +
                "<body>\n" +
                "\n" +
                "    <form>\n" +
                "        <p>Ingrese su nombre:<input type=\"text\" id=\"nombre\"></p>\n" +
                "        <p>Ingrese su edad:<input type=\"text\" id=\"edad\"></p>\n" +
                "        <p><input type=\"button\" value=\"Confirmar\" onClick=\"mostrar()\"></p>\n" +
                "    </form>\n" +
                "\n" +
                "    <script>\n" +
                "        function mostrar() {\n" +
                "            let nom = document.getElementById('nombre').value;\n" +
                "            let ed = document.getElementById('edad').value;\n" +
                "            alert('Ingresó el nombre:' + nom);\n" +
                "            alert('Y la edad:' + ed);\n" +
                "        }\n" +
                "    </script>\n" +
                "\n" +
                "</body>\n" +
                "\n" +
                "</html>";
    }
    @GetMapping("/indice1")
    public String indice(){
        return"<!DOCTYPE html>\n" +
                "<html>\n" +
                "\n" +
                "<head>\n" +
                "    <title>Ejemplo de JavaScript</title>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "</head>\n" +
                "\n" +
                "<body>\n" +
                "\n" +
                "    <script>\n" +
                "        let nombre = 'Juan';\n" +
                "        let edad = 10;\n" +
                "        let altura = 1.92;\n" +
                "        let casado = false;\n" +
                "        document.write(nombre);\n" +
                "        document.write('<br>');\n" +
                "        document.write(edad);\n" +
                "        document.write('<br>');\n" +
                "        document.write(altura);\n" +
                "        document.write('<br>');\n" +
                "        document.write(casado);\n" +
                "    </script>\n" +
                "\n" +
                "</body>\n" +
                "\n" +
                "</html>";
    }
    @GetMapping("/for")
    public String instanciFor(){
        return "<!DOCTYPE html>\n" +
                "<html>\n" +
                "\n" +
                "<head>\n" +
                "    <title>Ejemplo de JavaScript</title>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "</head>\n" +
                "\n" +
                "<body>\n" +
                "\n" +
                "    <script>\n" +
                "        for (let f = 1; f <= 10; f++) {\n" +
                "            document.write(f + \" \");\n" +
                "        }\n" +
                "    </script>\n" +
                "\n" +
                "</body>\n" +
                "\n" +
                "</html>";
    }
}
