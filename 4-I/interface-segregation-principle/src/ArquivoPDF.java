    public class ArquivoPDF implements ItemGeral, ItemDigital{
        String nome;
        String autor;
        int pagina;
        public ArquivoPDF(String nome, String autor, int pagina) {
            this.nome=nome;
            this.autor=autor;
            this.pagina=pagina;
        }

        public String getNome(){
            return nome;
        }
        public String getAutor(){
            return autor;
        }
        public int getPagina(){
            return pagina;
        }
        public void listarItem(){
            System.out.println("Tipo: PDF\nTítulo: "+nome+"\nAutor: "+autor+"\nPáginas: "+pagina+"\n");
        }
    }