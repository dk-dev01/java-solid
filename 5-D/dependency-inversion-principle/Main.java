public class Main{
    public static void main(String[] args){
        IServicoNotificacao servicoEmail = new ServicoEmailSmtp();
        ProcessadorPedidos processadorEmail = new ProcessadorPedidos(servicoEmail);
        processadorEmail.processar("dkzin", "Promoção", "Parabéns! Você conseguiu entrar na equipe de desenvolviemnto Java!");

        IServicoNotificacao servicoSms = new ServicoSms();
        ProcessadorPedidos processadorSms = new ProcessadorPedidos(servicoSms);
        processadorSms.processar("dkzin", "Trocar senha", "O código de verificação é 2469");
    }
}
