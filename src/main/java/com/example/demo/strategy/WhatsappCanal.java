package com.example.demo.strategy;

import com.example.demo.dto.TipoCanal;
import org.springframework.stereotype.Component;

@Component
public class WhatsappCanal implements CanalNotificacao {

    @Override
    public TipoCanal tipo() { return TipoCanal.WHATSAPP; }

    @Override
    public String enviar(String destinatario, String mensagem) {
        return "WhatsApp enviado para " + destinatario + ": " + mensagem;
    }
}