package com.marcos.tema_quiz.controller;

import com.marcos.tema_quiz.dto.CepRequest;
import com.marcos.tema_quiz.service.ServiceCep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cep")
public class ControllerCep {

    @Autowired
    private ServiceCep serviceCep;

    @GetMapping("/{cep}")
    public String getCep(@PathVariable String cep) {
        return serviceCep.getCepInfo(cep);
    }

    @PostMapping("/")
    public String postCep(@RequestBody CepRequest cepRequest) {
        return serviceCep.getCepInfo(cepRequest.getCep());
    }

}
