public class ServicoEmailSmtp implements IServicoNotificacao{

    public void enviarNotificacao(String destinatario, String assunto, String mensagem){
        System.out.println("Enviado email para: "+destinatario+"\nAssunto: "+assunto+"\nMensagem: "+mensagem+"\n");
    }
}
