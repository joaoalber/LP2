package mensagem;

public class Leitor extends Thread {

    Mensagem mensagem;

    public Leitor(Mensagem mensagem) {
        this.mensagem = mensagem;
    }

    public void run() {
        try {
            if (this.mensagem.existeMensagem()) {
                System.out.println(this.mensagem.lerMensagem());  
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

}
