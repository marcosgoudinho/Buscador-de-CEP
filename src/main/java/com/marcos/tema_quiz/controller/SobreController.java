package com.marcos.tema_quiz.controller;

import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/sobre")
public class SobreController {

    @GetMapping()
    public Map<String, String> sobre() {
        Map<String, String> response = new HashMap<>();
        response.put("estudante", "Marcos Vinicius Goudinho da Silva");
        response.put("projeto", "Buscador de CEP");
        return response;
    }

}