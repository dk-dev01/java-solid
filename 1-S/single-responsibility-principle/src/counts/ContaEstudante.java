package counts;

import client.Cliente;
import discount.Desconto;

public class ContaEstudante extends Conta
{
    private Desconto d;

    public ContaEstudante(Cliente c, Desconto d){
        super(c);
        this.d=d;
    }

    public double getSaldo(){
        return d.getDesconto(getSaldoBruto());
    }
}