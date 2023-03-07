package com.estacionamento.patio.repositories;

import com.estacionamento.patio.entities.Vaga;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VagaRepository extends JpaRepository<Vaga, Integer> {
    long count();
    void deleteVagaByPlaca(String placa);
}
