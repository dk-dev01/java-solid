   public class Livro implements ItemGeral, ItemFisico{
        String nome;
        String autor;
        String setor;
        int prateleira;

        public Livro(String nome, String autor, String setor, int prateleira) {
            this.nome=nome;
            this.autor=autor;
            this.setor=setor;
            this.prateleira=prateleira;
        }
        public String getNome(){
            return nome;
        }
        public String getAutor(){
            return autor;
        }
        public String getSetor(){
            return setor;
        }
        public int getPrateleira(){
            return prateleira;
        }

        public void listarItem(){
            System.out.println("Tipo: Livro\nTítulo: "+nome+"\nAutor: "+autor+"\nSetor: "+setor+"\nPrateleira: "+prateleira+"\n");
        }
    }