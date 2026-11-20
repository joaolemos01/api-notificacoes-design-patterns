package com.example.demo.strategy;

import com.example.demo.dto.TipoCanal;
import org.springframework.stereotype.Component;

@Component
public class EmailCanal implements CanalNotificacao {

    @Override
    public TipoCanal tipo() { return TipoCanal.EMAIL; }

    @Override
    public String enviar(String destinatario, String mensagem) {
        return "E-mail enviado para " + destinatario + ": " + mensagem;
    }
}
