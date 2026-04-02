package simulator;

import java.util.*;
import types.Voavel;
import types.Nadavel;

public class Simulador {

    public void SimularVoo(List<Voavel> v){
        System.out.println("Iniciando simulação de voo...");

        for(Voavel x : v){
            x.voar();
        }
        System.out.println("Simulação concluída!\n");
    }

    public void SimularNado(List<Nadavel> n){
        System.out.println("Iniciando simulação de nado...");

        for(Nadavel x : n){
            x.nadar();
        }
        System.out.println("Simulação concluída!\n");
    }
}
