import java.util.InputMismatchException;
import java.util.Scanner;

public class itens extends atributos {
    public int id;
    public int tipo;
    public int nivelDoItem = 1;
    public int raridade = 1;
    public int item;

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getNivelDoItem() {
        return nivelDoItem;
    }

    public void setNivelDoItem(int nivelDoItem) {
        this.nivelDoItem = nivelDoItem;
    }

    public int getRaridade() {
        return raridade;
    }

    public void setRaridade(int raridade) {
        this.raridade = raridade;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void escolhaItem() {
        Scanner ler = new Scanner(System.in);
        boolean verificacao = false;
        System.out.println("Escolha seu item: \n 1: anel \n 2: armadura ");

        do {
            try {
                this.item = ler.nextInt();
                verificacao = true;

                switch (item) {
                    case 1:
                        System.out.println("Anel");
                        System.out.println(
                                "aneias disponiveis: \n 1: anel do rei demonio \n 2: anel do arcanjo da luz esquecida \n 3: anel do viajante fuleira");

                        do {
                            try {
                                int escolhaAnel = ler.nextInt();
                                verificacao = true;

                                switch (escolhaAnel) {
                                    case 1:
                                        System.out.println("Anel do rei demônio - Maior dano contra humanos");
                                        verificacao = true;
                                        break;
                                    case 2:
                                        System.out.println(
                                                "Anel do arcanjo da luz esquecida - Fornece maior capacidade de mana e resistência mágica");
                                        verificacao = true;
                                        break;
                                    case 3:
                                        System.out.println(
                                                "Anel do viajante fuleiro - Cria a habilidade de viajar 2 minutos no passado e 30 segundos no futuro");
                                        verificacao = true;
                                        break;
                                    default:
                                        System.out.println("Escolha inválida");
                                        verificacao = false;
                                        break;
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada inválida! Certifique-se de digitar um número inteiro.");
                                ler.nextLine();
                                verificacao = false;
                            }
                        } while (!verificacao);
                        break;
                    case 2:
                        System.out.println(
                                "Armadura \n 1: armadura do rei druida \n 2: armadura do lorde os esquecidos \n 3: armadura do amante de livros ");
                        do {
                            try {
                                int escolhaArmadura = ler.nextInt();
                                verificacao = true;

                                switch (escolhaArmadura) {
                                    case 1:
                                        System.out.println("Armadura do rei druida - +19% de cura ao ingerir plantas");
                                        verificacao = true;
                                        break;
                                    case 2:
                                        System.out.println("Armadura do lorde dos esquecidos - -24% de detecção");
                                        verificacao = true;
                                        break;
                                    case 3:
                                        System.out.println("Armadura do amante de livros - +60% no ganho de XP");
                                        verificacao = true;
                                        break;
                                    default:
                                        System.out.println("Escolha inválida");
                                        verificacao = false;
                                        break;
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada inválida! Certifique-se de digitar um número inteiro.");
                                ler.nextLine();
                                verificacao = false;
                            }
                        } while (!verificacao);
                        break;
                    case 3:
                        System.out.println("Arma");
                        break;
                    default:
                        System.out.println("Escolha inválida");
                        verificacao = false;
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Certifique-se de digitar um número inteiro.");
                ler.nextLine();
                verificacao = false;
            }
        } while (!verificacao);
    }
}
