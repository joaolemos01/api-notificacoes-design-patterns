package com.example.demo.strategy;

import com.example.demo.dto.TipoCanal;
import org.springframework.stereotype.Component;

@Component
public class SmsCanal implements CanalNotificacao {

    @Override
    public TipoCanal tipo() { return TipoCanal.SMS; }

    @Override
    public String enviar(String destinatario, String mensagem) {
        return "SMS enviado para " + destinatario + ": " + mensagem;
    }
}