package payments;

public class CartaoCredito implements Pagamento
{
    public void getValor(double valor){
        System.out.printf("Valor de R$%.2f sendo processado via Cartão de Crédito...", valor);
        System.out.printf("\nPagamanto Realizado");
    }
}