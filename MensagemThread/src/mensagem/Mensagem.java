package mensagem;

public class Mensagem {

    String mensagem;
    boolean emOperacao;

    public synchronized void armazenaMensagem(String mensagem) {
        while (this.emOperacao == true) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        this.emOperacao = true;

        try {
            Thread.sleep(200);

        } catch (InterruptedException e) {

        }
        this.mensagem = mensagem;

        this.emOperacao = false;
        notifyAll();

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
