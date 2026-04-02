package animals;

import types.Nadavel;

public class Pinguim extends Ave implements Nadavel{
    public Pinguim(String nome){
        super(nome);
    }

    public void nadar(){
        System.out.println("O pinguim cujo nome, "+nome+" está nadanado rápido!");
    }
}

