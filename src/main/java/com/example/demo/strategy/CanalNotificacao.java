package com.example.demo.strategy;

import com.example.demo.dto.TipoCanal;

public interface CanalNotificacao {
    TipoCanal tipo();
    String enviar(String destinatario, String mensagem);
}