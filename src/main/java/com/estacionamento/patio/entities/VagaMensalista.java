package com.estacionamento.patio.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class VagaMensalista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String placa;

}
