package mensagem;

public class Leitor {

    Mensagem mensagem;

    public void ler(Mensagem mensagem) {
        this.mensagem = mensagem;
        System.out.println(this.mensagem.lerMensagem());
    }
    
}
