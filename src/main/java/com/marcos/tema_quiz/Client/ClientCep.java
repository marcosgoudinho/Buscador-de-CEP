package com.marcos.tema_quiz.Client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ClientCep {

    private final RestTemplate restTemplate = new RestTemplate();

    public String buscarCep(String cep) {
        String url = "https://viacep.com.br/ws/" + cep + "/json/";
        return restTemplate.getForObject(url, String.class);
    }
}
