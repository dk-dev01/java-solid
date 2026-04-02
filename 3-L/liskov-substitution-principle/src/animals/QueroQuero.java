package animals;

import types.Voavel;

public class QueroQuero extends Ave implements Voavel{
    public QueroQuero(String nome){
        super(nome);
    }

    public void voar(){
        System.out.println("O quero-quero cujo nome, "+nome+" está voando alto!");
    }
}
