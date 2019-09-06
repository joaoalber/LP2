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
        
        
        try {
            if (!msg.existeMensagem()) {
                msg.armazenaMensagem(mensagem);
                leitor.ler(msg);
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

}
