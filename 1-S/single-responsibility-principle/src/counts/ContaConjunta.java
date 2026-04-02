package counts;

import client.Cliente;
import discount.Desconto;

public class ContaConjunta extends Conta
{
    private Desconto d;

    public ContaConjunta(Cliente c, Desconto d){
        super(c);
        this.d=d;
    }

    public double getSaldo(){
        return d.getDesconto(getSaldoBruto());
    }
}