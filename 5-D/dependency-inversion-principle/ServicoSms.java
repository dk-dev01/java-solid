public class ServicoSms implements IServicoNotificacao{

    public void enviarNotificacao(String destinatario, String assunto, String mensagem){
        System.out.println("Enviado SMS para: "+destinatario+"\nAssunto: "+assunto+"\nMensagem: "+mensagem+"\n");
    }
}
