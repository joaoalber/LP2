package mensagem;

import java.util.ArrayList;


public class Escritor extends Thread {

    Mensagem mensagem;
    ArrayList lista;
    
    public Escritor(Mensagem mensagem, ArrayList lista) {
        this.mensagem = mensagem;
        this.lista = lista;
    }
    
    public void run() {
        
        try {
            
            for (int i = 0; i < lista.size(); i++) {
                this.mensagem.armazenaMensagem(lista.get(i).toString());
               
          
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

}
