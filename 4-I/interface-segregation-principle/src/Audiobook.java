
    public class Audiobook implements ItemGeral, ItemAudio{
        String nome;
        String autor;
        String narrador;
        int duracao;

        public Audiobook(String nome, String autor, String narrador, int duracao) {
            this.nome=nome;
            this.autor=autor;
            this.narrador=narrador;
            this.duracao=duracao;
        }

        public String getNome(){
            return nome;
        }
        public String getAutor(){
            return autor;
        }
        public String getNarrador(){
            return narrador;
        }
        public int getDuracao(){
            return duracao;
        }
        public void listarItem(){
            System.out.println("Tipo: AudioBook\nTítulo: "+nome+"\nAutor: "+autor+"\nNarrador: "+narrador+"\nDuração: "+duracao+" minuto(s)\n");
        }
    }