package mensagem;
public class Mensagem {
    
    String mensagem;
    
    public void armazenaMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
    public String lerMensagem() {
        String mens = this.mensagem;
        this.mensagem = null;
        return mens;
    }
    
    public boolean existeMensagem() {
       if (this.mensagem != null) {
            return true;
        }
        return false;
    }
    
}
