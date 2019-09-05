package mensagem;

public class Escritor extends Thread {

    String mensagem;
    Leitor leitor;
    
    public Escritor(String mensagem, Leitor leitor) {
        this.mensagem = mensagem;
        this.leitor = leitor;
    }
    
    public void run() {
        
        Mensagem msg = new Mensagem();
        msg.armazenaMensagem(mensagem);
        leitor.ler(msg);
        
        try {
            if (!msg.existeMensagem()) {
                msg.armazenaMensagem(mensagem);
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

}
