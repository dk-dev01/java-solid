package app;

import java.util.*;

import types.Voavel;
import types.Nadavel;
import animals.Aguia;
import animals.Pinguim;
import animals.QueroQuero;
import simulator.Simulador;

public class Main {
    public static void main(String[] args) {

        Simulador s = new Simulador();

        Aguia a1 = new Aguia("Deagle");
        Pinguim p1 = new Pinguim("Kadu");
        QueroQuero q1 = new QueroQuero("Tetéu");

        List<Voavel> voador1 =  Arrays.asList(a1);
        List<Voavel> voador2 =  Arrays.asList(q1);
        List<Nadavel> nadadores =  Arrays.asList(p1);

        s.SimularVoo(voador1);
        s.SimularVoo(voador2);
        s.SimularNado(nadadores);
    }
}