package com.example.demo.controller;

import com.example.demo.dto.NotificacaoRequest;
import com.example.demo.facade.NotificacaoFacade;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/notificacoes")
public class NotificacaoController {

    private final NotificacaoFacade facade;

    public NotificacaoController(NotificacaoFacade facade) {
        this.facade = facade;
    }

    @PostMapping
    public ResponseEntity<Map<String, String>> enviar(@Valid @RequestBody NotificacaoRequest request) {
        return ResponseEntity.ok(Map.of("status", facade.enviar(request)));
    }
}