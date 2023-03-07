package com.estacionamento.patio.service;

import com.estacionamento.patio.entities.Vaga;
import com.estacionamento.patio.repositories.VagaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class OcuparVagaService {
    private final VagaRepository vagaRepository;
    public void execute(String placa){
        Vaga vaga = new Vaga();
        vaga.setPlaca(placa);
        System.out.println(placa);
        System.out.println(vaga);
        vagaRepository.save(vaga);
    }
}
