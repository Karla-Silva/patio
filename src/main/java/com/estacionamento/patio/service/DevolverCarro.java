package com.estacionamento.patio.service;

import com.estacionamento.patio.repositories.VagaRepository;

public class DevolverCarro {
    private VagaRepository vagaRepository;

    public void execute(String placa){
        vagaRepository.deleteVagaByPlaca(placa);
    }
}
