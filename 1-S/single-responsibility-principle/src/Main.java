import client.Cliente;
import counts.*;
import discount.Desconto10;
import discount.Desconto20;
import discount.Desconto30;
import discount.Desconto5;

public class Main
{
    public static void main (String[] args){
        Conta c1 = new ContaEstudante(new Cliente("Dkzin") , new Desconto5());
        System.out.println("counts.Conta de Estudante: " + c1.getNome());
        System.out.println("Depósito: R$" + c1.deposito(200));
        System.out.println("Saldo: "+ c1.getSaldo());

        Conta c2 = new ContaConjunta(new Cliente("Dkzin") , new Desconto10());
        System.out.println("\ncounts.Conta Conjunta: " + c2.getNome());
        System.out.println("Depósito: R$" + c2.deposito(500));
        System.out.println("Saldo: R$"+ c2.getSaldo());

        Conta c3 = new ContaCorrente(new Cliente("Dkzin") , new Desconto20());
        System.out.println("\ncounts.Conta Corrente: " + c3.getNome());
        System.out.println("Depósito: R$" + c3.deposito(1000));
        System.out.println("Saldo: R$"+ c3.getSaldo());

        Conta c4 = new ContaEmpresarial(new Cliente("Dkzin") , new Desconto30());
        System.out.println("\ncounts.Conta Empresarial: " + c4.getNome());
        System.out.println("Depósito: R$" + c4.deposito(5000));
        System.out.println("Saldo: R$"+ c4.getSaldo());
    }
}
