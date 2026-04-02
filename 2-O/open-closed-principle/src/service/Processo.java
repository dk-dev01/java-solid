package service;

import payments.Pagamento;

public class Processo //classe que aplica "O" de SOLID (aberto para EXTENSÃO e fechado para MODIFICAÇÃO)
{
    public void processo(Pagamento p, double valor){
        p.getValor(valor);  //responsabilidade para metodo concreto
        System.out.println("\nservice.Processo concluído com sucesso!\n");
    }
}