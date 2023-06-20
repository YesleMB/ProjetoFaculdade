import java.util.InputMismatchException;
import java.util.Scanner;

public class atributos extends App {
    private int nivel = 1;
    public String nome;
    public String genero;
    public String raca;

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
                        break;
                    case 2:
                        System.out.println("Classe escolhida é: Mago");
                        validacao = true;

                        break;
                    case 3:
                        System.out.println("Classe escolhida é: Arqueiro");
                        validacao = true;

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
        int escolha = 0;
        boolean validacao = false;
        do{
        try {
            escolha = ler.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Raça escolhida é: humano");
                    validacao=true;
                    break;
                case 2:
                    System.out.println("Raça escolhida é: elfo");
                     validacao=true;
                    break;
                case 3:
                    System.out.println("Raça escolhida é: anão");
                     validacao=true;
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
        return escolha;
    }

    public int EscolhaGenero() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escolha uma genero (1: masculino, 2: feminino, 3: não binario): ");
            int gen = 0;
            boolean validacao = false;
do{
        try {
            gen = ler.nextInt();
            switch (gen) {
                case 1:
                    System.out.println(" genero escolhida é: masculino");
                     validacao=true;
                    break;
                case 2:
                    System.out.println(" genero escolhida é: feminino");
                     validacao=true;
                    break;
                case 3:
                    System.out.println(" genero escolhida é: nao binario");
                     validacao=true;
                    break;
                default:

            }
        } catch (InputMismatchException a) {
            System.out.println("Entrada inválida! Certifique-se de digitar um número inteiro.");
                ler.nextLine();
        }
    }while(!validacao);
        return gen;

    }

}
