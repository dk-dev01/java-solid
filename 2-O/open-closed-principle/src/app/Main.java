package app;

import payments.Pix;
import payments.Boleto;
import payments.CartaoCredito;
import payments.Pagamento;
import service.Processo;

public class Main
{
    public static void main(String[] args){
        Processo pc = new Processo();

        Pagamento cc = new CartaoCredito();
        pc.processo(cc, 500);

        Pagamento bo = new Boleto();
        pc.processo(bo, 600);

        Pagamento pix = new Pix();
        pc.processo(pix, 400);
    }
}