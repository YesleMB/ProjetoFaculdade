import java.util.InputMismatchException;
import java.util.Scanner;

public class atributos extends skillsAtributos {
    private int nivel = 1;
    public String nome;
    public int genero;
    public int raca;
    public int classe;
    public int id;
    private String nomeClasse;
    private String nomeRaca;
    private String nomeGenero;
    

    public String getNomeRaca() {
         String nomeRaca = "";
        switch (this.raca) {
            case 1:
                nomeRaca = "humano";
                break;
            case 2:
                nomeRaca = "elfo";
                break;
            case 3:
                nomeRaca = "anao";
                break;
            default:
                nomeRaca = "Classe inválida";
                break;}
        return nomeRaca;
    }

    public String getNomeGenero() {
        String nomeGenero = "";
        switch (this.genero) {
            case 1:
                nomeRaca = "homem";
                break;
            case 2:
                nomeRaca = "feminino";
                break;
            case 3:
                nomeRaca = "nao binario";
                break;
            default:
                nomeRaca = "Classe inválida";
                break;}
        return nomeGenero;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String valorNome) {
        
        this.nome = valorNome;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public int getRaca() {
        return raca;
    }

    public void setRaca(int raca) {
        this.raca = raca;
    }

    public int getClasse() {
        return classe;
    }

    public void setClasse(int classe) {
      int paladino;
        this.classe = classe;
    }
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void  Personagem() {
        
     
        
    }

    public String getNomeClasse() {
        String nomeClasse = "";
        switch (this.classe) {
            case 1:
                nomeClasse = "Paladino";
                getClassPaladino();
                break;
            case 2:
                nomeClasse = "Mago";
                getClassMago();

                break;
            case 3:
                nomeClasse = "Arqueiro";
             getClassArqueiro();
                break;
            default:
                nomeClasse = "Classe inválida";
                break;
        }
        return nomeClasse;
    }

   
    public int EscolhaClasses() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escolha a classe (1: Paladino, 2: Mago, 3: Arqueiro): ");
       
        boolean validacao = false;
        do {
            try {
                this.classe = ler.nextInt();
                switch (this.classe) {
                    case 1:
                       nomeClasse = "paladin";
                        validacao = true;
                        if (validacao) {
                            getClassPaladino();
                        }
                        break;
                    
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            } catch (InputMismatchException i) {
                System.out.println("Entrada inválida! Certifique-se de digitar um número inteiro.");
            }
            ler.nextLine();
        } while (!validacao);
        return classe;

    }

    public int EscolhaRaca() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Escolha uma raça (1: humano, 2: elfo, 3: anão): ");
      
        boolean validacao = false;
        do{
        try {
           this.raca = ler.nextInt();
            switch (this.raca
) {
                case 1:
                    System.out.println("Raça escolhida é: Humano");
                     validacao=true;
                     if(validacao){
                        getRacaHumano();
                     }
                    break;
                case 2:
                    System.out.println("Raça escolhida é: Elfo");
                     validacao=true;
                     if(validacao){
                        getRacaElfo();
                     }
                    break;
                case 3:
                    System.out.println("Raça escolhida é: Anão");
                     validacao=true;
                     if(validacao){
                        getRacaAnao();
                     }
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida! Certifique-se de digitar um número inteiro.");
            ler.nextLine();
        }
    }while(!validacao);
        return    raca ;

    }

    public int EscolhaGenero() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escolha uma genero (1: masculino, 2: feminino, 3: não binario): ");
       
        boolean validacao = false;
        do {
            try {
                this.genero = ler.nextInt();
                switch (this.genero) {
                    case 1:
                        System.out.println(" genero escolhida é: masculino");
                        validacao = true;
                        break;
                    case 2:
                        System.out.println(" genero escolhida é: feminino");
                        validacao = true;
                        break;
                    case 3:
                        System.out.println(" genero escolhida é: nao binario");
                        validacao = true;
                        break;
                    default:

                }
            } catch (InputMismatchException a) {
                System.out.println("Entrada inválida! Certifique-se de digitar um número inteiro.");
                ler.nextLine();
            }
        } while (!validacao);
        return genero;

    }

   
}

   
