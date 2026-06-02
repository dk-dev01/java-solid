public class ProcessadorPedidos{
    private IServicoNotificacao notificacao;

    public ProcessadorPedidos(IServicoNotificacao notificacao){
        this.notificacao=notificacao;
    }

    public void processar(String destinatario, String assunto, String mensagem){
        System.out.println("Processando pedido...");
        notificacao.enviarNotificacao(destinatario, assunto, mensagem);
    }
}
