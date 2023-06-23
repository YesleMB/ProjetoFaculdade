public class skillsAtributos {
     public String personagem;
    //skill das raças
    String[] racaHumano = new String[3];
    String[] racaElfo = new String[3];
    String[] racaAnao = new String[3]; 
    //skill das classes
    String[] classPaladino = new String[3];
    String[] classMago = new String[3];
    String[] classArqueiro = new String[3];

    public String[] getClassPaladino() {
            System.out.println("Atributos da classe paladino");
        classPaladino[0] = "paladino ganha poder divino e benção da deusa";
        classPaladino[1] = "buff em usar armaduras pesadas com espada e escudo";
        classPaladino[2] = "dano ampliado contra mortos vivos/sofre mais dano de magia negra ";
        for (String pa : classPaladino) {
            System.out.println(pa);
        }
        return classPaladino;
    }

    public void setClassPaladino(String[] classPaladino) {
        this.classPaladino = classPaladino;
    }

    public String[] getClassMago() {
            System.out.println("Atributos da classe mago");
        classMago[0] = "arvore de magias e encantamentos desbloqueada";
        classMago[1] = "buff de 10% ao usar pergaminhos magicos";
        classMago[2] = "magias de vida cura voce e seus aliados";
        for (String ma : classMago) {
            System.out.println(ma);
        }
        return classMago;
    }

    public void setClassMago(String[] classMago) {
        this.classMago = classMago;
    }

    public String[] getClassArqueiro() {
            System.out.println("Atributos da classe arqueiro");
        classArqueiro[0] = "aumento de dano baseado na distancia do alvo";
        classArqueiro[1] = "habilidades de camuflagem e invisibilidade desbloqueada";
        classArqueiro[2] = "ao usar arco ganho de 30% de velocidade de ataque/ao usar besta ganho  de 15% de dano fisico";    
        for (String ar : classArqueiro) {
            System.out.println(ar);
        }
        return classArqueiro;
    }

    public void setClassArqueiro(String[] classArqueiro) {
        this.classArqueiro = classArqueiro;
    }

    public String[] getRacaHumano() {
            System.out.println("Atributos da raça humana:");
        racaHumano[0] = "100 pontos de vida";
        racaHumano[1] = "expectativa de vida maxima de 70 anos";
        racaHumano[2] = "porcentagem de afinidade com magia aleatoria";

        for (String ra : racaHumano) {
            System.out.println(ra);
        }
        return racaHumano;
    }

    public void setRacaHumano(String[] racaHumano) {
        this.racaHumano = racaHumano;
    }

    public String[] getRacaElfo() {
            System.out.println("Atributos da raça Elfo:");
        racaElfo[0] = "350 pontos de vida";
        racaElfo[1] = "expectativa de vida maxima 900 anos";
        racaElfo[2] = "alta afinidade com magia";
        for (String ra : racaElfo) {
            System.out.println(ra);
        }
        return racaElfo;
    }

    public void setRacaElfo(String[] racaElfo) {
        this.racaElfo = racaElfo;
    }

    public String[] getRacaAnao() {
            System.out.println("Atributos da raça anao:");
        racaAnao[0] = "500 pontos de vida";
        racaAnao[1] = "expectativa de vida 500 anos";
        racaAnao[2] = "baixa afinidade com magia";
        for (String ra : racaAnao) {
            System.out.println(ra);
        }
        return racaAnao;
    }

    public void setRacaAnao(String[] racaAnao) {
        this.racaAnao = racaAnao;
    }

}
