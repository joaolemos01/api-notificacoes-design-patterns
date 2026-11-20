package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record NotificacaoRequest(
        @NotNull TipoCanal canal,
        @NotBlank String destinatario,
        @NotBlank String mensagem) {}