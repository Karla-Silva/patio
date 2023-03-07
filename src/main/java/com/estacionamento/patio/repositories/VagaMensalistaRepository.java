package com.estacionamento.patio.repositories;

import com.estacionamento.patio.entities.VagaMensalista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VagaMensalistaRepository extends JpaRepository<VagaMensalista, Integer> {
    long count();

}
