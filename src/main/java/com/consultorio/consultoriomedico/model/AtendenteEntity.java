package com.consultorio.consultoriomedico.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="atendente")
public class AtendenteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String nome;
}

//https://www.devmedia.com.br/jpa-como-usar-a-anotacao-generatedvalue/38592