package mensagem;
public class Main {
    public static void main(String[] args) {
        
        Leitor leitor = new Leitor();
        Escritor escritor = new Escritor("teste", leitor);
         
        escritor.start();
        
        
    }
}
