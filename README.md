# API de Notificações

API REST em Java com Spring Boot que envia notificações por diferentes canais (e-mail, SMS e WhatsApp), criada como desafio de projeto do curso *Design Patterns com Java: Dos Clássicos (GoF) ao Spring Framework* (DIO).

## Padrões de projeto utilizados

- **Strategy**: a interface `CanalNotificacao` define o contrato de envio e cada canal (`EmailCanal`, `SmsCanal`, `WhatsappCanal`) tem sua própria implementação. Para adicionar um canal novo, basta criar uma nova classe.
- **Facade**: a classe `NotificacaoFacade` expõe um único método `enviar` e esconde do controller a escolha do canal.
- **Singleton**: os beans do Spring (`@Component` e `@Service`) são singletons por padrão, ou seja, existe uma única instância de cada canal e da facade.

## Tecnologias

Java 17, Spring Boot 3, Maven, Bean Validation.

## Como executar

```bash
./mvnw spring-boot:run
```

A API sobe em `http://localhost:8080`.

## Endpoint

`POST /notificacoes`

```json
{
  "canal": "WHATSAPP",
  "destinatario": "83999999999",
  "mensagem": "Olá, seu pedido saiu para entrega!"
}
```

Canais disponíveis: `EMAIL`, `SMS`, `WHATSAPP`.

Resposta (200):

```json
{ "status": "WhatsApp enviado para 83999999999: Olá, seu pedido saiu para entrega!" }
```

Campos vazios ou canal inexistente retornam erro 400.