# Single Responsibility Principle (SRP) em Java

Projeto desenvolvido em Java para demonstrar, na prática, o princípio **S** do **SOLID**: **Single Responsibility Principle** (Princípio da Responsabilidade Única).

## Objetivo

O objetivo desta atividade foi refatorar uma classe `Conta` que concentrava responsabilidades demais em um único lugar, contrariando o princípio da responsabilidade única.

A proposta era reorganizar o código para deixá-lo mais coeso, mais limpo e mais fácil de manter.

## Problema da implementação original

Na versão inicial, a classe `Conta` fazia muitas coisas ao mesmo tempo:

- armazenava os dados da conta
- armazenava o cliente
- realizava depósito e saque
- aplicava descontos
- decidia qual regra usar com vários `if` e `else`

Esse tipo de solução pode até funcionar em casos pequenos, mas em sistemas reais tende a crescer de forma desorganizada, gerando classes grandes, pouco coesas e difíceis de manter.

## Classe original proposta na atividade

```java
public class Conta {
    
    private double saldo;
    private Cliente cliente;
    
    public Conta(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean saca(double valorDoSaque){
        if(getSaldo() < valorDoSaque){
            return false;
        } else {
            saldo = saldo - valorDoSaque;
            return true;
        }
    }

    public void deposita(double valorDepositado){
        saldo = saldo + valorDepositado;
    }
            
    public double getSaldo() {
        
        if(this.cliente.getTipoConta() == TiposConta.CONJUNTA) {
            return descontoDezPorcento(this.saldo);
            
        } else if (this.cliente.getTipoConta() == TiposConta.CORRENTE) {
            return descontoVintePorcento(this.saldo);
            
        } else if (this.cliente.getTipoConta() == TiposConta.EMPRESARIAL) {
            return descontoTrintaPorcento(this.saldo);
            
        } else if (this.cliente.getTipoConta() == TiposConta.ESTUDANTE) {
            return descontoCincoPorcento(this.saldo);
        } else {
            throw new RuntimeException("tipo de conta inválida");
        }
    }
    
    private double descontoCincoPorcento(double valor) {
        return valor - ( valor * 0.05 );
    }
    
    private double descontoDezPorcento(double valor) {
        return valor - ( valor * 0.1 );
    }
    
    private double descontoVintePorcento(double valor) {
        return valor - ( valor * 0.2 );
    }
    
    private double descontoTrintaPorcento(double valor) {
        return valor - ( valor * 0.3 );
    }
}
