package animals;

import types.Voavel;

public class Aguia extends Ave implements Voavel{
    public Aguia(String nome){
        super(nome);
    }

    public void voar(){
        System.out.println("A aguia cujo nome, "+nome+" está voando alto!");
    }
}

