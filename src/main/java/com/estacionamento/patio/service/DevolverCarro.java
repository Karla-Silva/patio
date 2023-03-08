package com.estacionamento.patio.service;

import com.estacionamento.patio.repositories.VagaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DevolverCarro {
    private VagaRepository vagaRepository;

    public void execute(String placa){
        vagaRepository.deleteVagaByPlaca(placa);
    }
}
