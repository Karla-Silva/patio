package com.estacionamento.patio.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="vaga")
public class Vaga {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String placa;

}
