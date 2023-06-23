import java.util.InputMismatchException;
import java.util.Scanner;

public class atributos extends skillsAtributos {
    private int nivel = 1;
    private String nome;
    private String genero;
    private String raca;
    private String classe;

   

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int EscolhaClasses() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escolha a classe (1: Paladino, 2: Mago, 3: Arqueiro): ");
        int classe = 0;
        boolean validacao = false;
        do {
            try {
                classe = ler.nextInt();
                switch (classe) {
                    case 1:
                        System.out.println("Classe escolhida é: Paladino");
                        validacao = true;
                        if (validacao) {
                            getClassPaladino();
                        }
                        break;
                    case 2:
                        System.out.println("Classe escolhida é: Mago");
                        validacao = true;
                        if (validacao) {
                            getClassMago();
                        }

                        break;
                    case 3:
                        System.out.println("Classe escolhida é: Arqueiro");
                        validacao = true;
                        if (validacao) {
                            getClassArqueiro();
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
       int raca= 0;
        boolean validacao = false;
        do{
        try {
            raca = ler.nextInt();
            switch (raca
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
        return             raca ;

    }

    public int EscolhaGenero() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escolha uma genero (1: masculino, 2: feminino, 3: não binario): ");
        int genero = 0;
        boolean validacao = false;
        do {
            try {
                genero = ler.nextInt();
                switch (genero) {
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
