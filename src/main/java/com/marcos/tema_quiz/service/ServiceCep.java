package com.marcos.tema_quiz.service;

import com.marcos.tema_quiz.Client.ClientCep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceCep {

    @Autowired
    private ClientCep clientCep;

    public String getCepInfo(String cep) {
        return clientCep.buscarCep(cep);
    }
}
