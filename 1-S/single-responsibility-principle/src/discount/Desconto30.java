package discount;

public class Desconto30 implements Desconto
{
    public double getDesconto(double valor){
        return valor=valor*0.7;
    }
}