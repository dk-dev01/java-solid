package counts;

import client.Cliente;

public abstract class Conta
{
    private double saldo;
    private Cliente c;

    public Conta(Cliente c){
        this.c=c;
    }

    public double deposito(double valorD){
        if(valorD>0){
            saldo+=valorD;
        }
        return valorD;
    }

    public double saque(double valorS){
        if(valorS<saldo){
            saldo-=valorS;
        }
        return valorS;
    }

    public double getSaldoBruto(){
        return saldo;
    }

    public abstract double getSaldo();

    public String getNome() {
        return c.getNome();
    }
}