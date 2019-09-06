package mensagem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<String> lista1 = new ArrayList<>();
        ArrayList<String> lista2 = new ArrayList<>();
        
        
        lista1.add("oi");
        lista1.add("tudo");
        lista1.add("bem");
        lista1.add("com");
        lista1.add("voce");
        
        lista2.add("sim");
        lista2.add("e");
        lista2.add("com");
        lista2.add("você");
        lista2.add("?");
        
        Mensagem mensagem = new Mensagem();
        Escritor esc1 = new Escritor(mensagem, lista1);
        Escritor esc2 = new Escritor(mensagem, lista2);
        Leitor leitor = new Leitor(mensagem);
        
        
        esc1.start();
        esc2.start();
        leitor.start();
        
        
        
        
        
        
    }
}
