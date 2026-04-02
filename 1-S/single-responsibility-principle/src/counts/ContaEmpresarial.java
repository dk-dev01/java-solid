package counts;

import client.Cliente;
import discount.Desconto;

public class ContaEmpresarial extends Conta
{
    private Desconto d;

    public ContaEmpresarial(Cliente c, Desconto d){
        super(c);
        this.d=d;
    }

    public double getSaldo(){
        return d.getDesconto(getSaldoBruto());
    }

    public double getSaldoBruto(){
        return super.getSaldoBruto();
    }
}