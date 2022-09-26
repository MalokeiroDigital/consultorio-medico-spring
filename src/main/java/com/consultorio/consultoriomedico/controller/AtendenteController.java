package com.consultorio.consultoriomedico.controller;

import com.consultorio.consultoriomedico.model.AtendenteEntity;
import com.consultorio.consultoriomedico.repository.AtendenteRepository;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value = "/atendente")
public class AtendenteController {

    private AtendenteRepository repositorio;

    @ResponseBody
    @PostMapping(value = "nome")
    public int add(@RequestBody String nome){
        AtendenteEntity atendente = new AtendenteEntity();
        atendente.setNome(nome);
        this.repositorio.save(atendente);
        return atendente.getId();
    }
}
