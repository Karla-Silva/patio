package com.estacionamento.patio.service;

import com.estacionamento.patio.entities.VagaMensalista;
import com.estacionamento.patio.repositories.VagaMensalistaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OcuparVagaMensalistaService {
    private final VagaMensalistaRepository vagaMensalistaRepository;
    public void execute(String placa){
        VagaMensalista vagaMensalista = new VagaMensalista();
        vagaMensalista.setPlaca(placa);
        vagaMensalistaRepository.save(vagaMensalista);
    }
}
