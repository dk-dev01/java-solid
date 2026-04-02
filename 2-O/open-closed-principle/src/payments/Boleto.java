package payments;

public class Boleto implements Pagamento
{
    public void getValor(double valor){
        System.out.printf("Valor de R$%.2f sendo processado via Boleto...", valor);
        System.out.printf("\nPagamanto Realizado");
    }
}