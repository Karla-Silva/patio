package com.estacionamento.patio.service;

import com.estacionamento.patio.repositories.VagaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ConsultarVagaService {
    private final VagaRepository vagaRepository;
    public boolean execute(){
        long vagasOcupadas = vagaRepository.count();
        return vagasOcupadas < 3;
    };
}
