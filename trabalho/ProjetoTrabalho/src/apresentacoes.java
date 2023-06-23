public class apresentacoes {
    int inicio;
    int mensagemPersonagem;
    int mensagemDeEscolhas;
    public int getMensagemDeEscolhas() {
         System.out.println("deseja mostrar todos os dados do personagem?");
        return mensagemDeEscolhas;
    }
    public void setMensagemDeEscolhas(int mensagemDeEscolhas) {
        this.mensagemDeEscolhas = mensagemDeEscolhas;
    }
    public int getInicio() {
        System.out.println("ola,vamos começar a criaçao de personagem");
        return inicio;
    }
    public void setInicio(int inicio) {
                
        this.inicio = inicio;
    }
    public int getMensagemPersonagem() {
                System.out.println("digite o nome do personagem");
        return mensagemPersonagem;
    }
    public void setMensagemPersonagem(int mensagemPersonagem) {
        this.mensagemPersonagem = mensagemPersonagem;
    }
    
}
