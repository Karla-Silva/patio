package com.estacionamento.patio.controller;

import com.estacionamento.patio.payloads.request.VagaRequest;
import com.estacionamento.patio.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patio")
@RequiredArgsConstructor
public class PatioController {
    private final ConsultarVagaService consultarVagaService;
    private final ConsultarVagaMensalistaService consultarVagaMensalistaService;
    private final OcuparVagaService ocuparVagaService;
    private final OcuparVagaMensalistaService ocuparVagaMensalistaService;
    private final DevolverCarro devolverCarro;

    @GetMapping(path = "/consultarvagas")
    public boolean getConsultarVagas(){
        return consultarVagaService.execute();
    }
    @GetMapping(path = "/consultarvagasmensalistas")
    public boolean getConsultarVagasMensalistas(){
        return consultarVagaMensalistaService.execute();
    }
    @PostMapping(path ="/ocuparvaga")
    @ResponseStatus(HttpStatus.CREATED)
    public void postOcuparVaga(@RequestBody VagaRequest vagaRequest){
        ocuparVagaService.execute(vagaRequest.getPlaca());
    }
    @PostMapping(path="/ocuparvagamensalista")
    @ResponseStatus(HttpStatus.CREATED)
    public void postOcuparVagaMensalista(@RequestBody VagaRequest vagaRequest){
        ocuparVagaMensalistaService.execute(vagaRequest.getPlaca());
    }
    @DeleteMapping(path="/devolvercarro")
    @ResponseStatus(HttpStatus.OK)
    public void deleteVagaByPlaca(@RequestBody VagaRequest vagaRequest){
        devolverCarro.execute(vagaRequest.getPlaca());
    }
}
