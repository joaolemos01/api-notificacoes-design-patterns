package com.example.demo.facade;

import com.example.demo.dto.NotificacaoRequest;
import com.example.demo.dto.TipoCanal;
import com.example.demo.strategy.CanalNotificacao;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class NotificacaoFacade {

    private final Map<TipoCanal, CanalNotificacao> canais;

    public NotificacaoFacade(List<CanalNotificacao> listaCanais) {
        this.canais = listaCanais.stream()
                .collect(Collectors.toMap(CanalNotificacao::tipo, Function.identity()));
    }

    public String enviar(NotificacaoRequest request) {
        CanalNotificacao canal = canais.get(request.canal());
        return canal.enviar(request.destinatario(), request.mensagem());
    }
}