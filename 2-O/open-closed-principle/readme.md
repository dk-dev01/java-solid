# Open/Closed Principle (OCP) em Java

Projeto desenvolvido em Java para demonstrar, na prática, o princípio **O** do **SOLID**: **Open/Closed Principle** (Princípio Aberto/Fechado).

## Objetivo

O objetivo deste exercício foi mostrar como um sistema pode ser estruturado para permitir a **adição de novos comportamentos sem precisar alterar classes já existentes**.

Neste caso, o exemplo trabalha com diferentes formas de pagamento, como:

- Pix
- Boleto
- Cartão de Crédito

## Ideia principal do OCP

O princípio **Open/Closed** diz que uma classe deve estar:

- **aberta para extensão**
- **fechada para modificação**

Ou seja, o sistema deve permitir adicionar novas funcionalidades sem ficar alterando toda hora o código que já está pronto e funcionando.

## Situação-problema

A atividade proposta foi **“Refatorando para o Open/Closed Principle (OCP)”**.

A ideia era evitar uma solução baseada em vários `if` e `else` para processar diferentes formas de pagamento.

Em uma implementação ruim, seria comum encontrar algo assim:

```java
if(tipoPagamento.equals("pix")) {
    // processa pix
} else if(tipoPagamento.equals("boleto")) {
    // processa boleto
} else if(tipoPagamento.equals("cartao")) {
    // processa cartão
}