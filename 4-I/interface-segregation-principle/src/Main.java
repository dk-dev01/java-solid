public class Main{
    public static void main(String[] args){
        Livro l1 = new Livro("Biblia Sagrada", "Deus", "Céu", 7);
        Audiobook a1 = new Audiobook("Salmos 23", "Rei Davi", "desconhecido", 1);
        ArquivoPDF pdf1 = new ArquivoPDF("Provérbios", "Salo�o", 100);

        l1.listarItem();
        a1.listarItem();
        pdf1.listarItem();
    }

}
