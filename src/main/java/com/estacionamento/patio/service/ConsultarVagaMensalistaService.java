package com.estacionamento.patio.service;

import com.estacionamento.patio.repositories.VagaMensalistaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ConsultarVagaMensalistaService {
    private final VagaMensalistaRepository vagaMensalistaRepository;
    public boolean execute(){
        long vagasOcupadas = vagaMensalistaRepository.count();
        return vagasOcupadas < 3;
    };
}
