package payments;

public class Pix implements Pagamento
{
    public void getValor(double valor){
        System.out.printf("Valor de R$%.2f sendo processado via Pix...", valor);
        System.out.printf("\nPagamanto Realizado");
    }
}