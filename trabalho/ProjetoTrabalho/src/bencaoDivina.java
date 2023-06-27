import java.net.SocketTimeoutException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class bencaoDivina {
    public int id;
    public String[] nome = new String[6];
    public int tipo;
    String[] nomeGrupo = getNome();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getNome() {
        nome[0] = "     benção do dragão de fogo ancestral Ikkaros ";
        nome[1] = "     benção do primeiro arquimago  ";
        nome[2] = "     benção da Deusa Panaceia ";
        nome[3] = "     bencão do grande assassino Makael ";
        nome[4] = "     benção da rainha  Elizabeth ";
        nome[5] = "     benção do rei druida Brennos";

        return nome;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void tipoEscolha() {
        Scanner ler = new Scanner(System.in);
        int escolhaBencao;
        boolean validacao = false;

        System.out.println("Escolha um tipo de benção para seu personagem:");
        System.out.println("1: Benções de buff em grupo");
        System.out.println("2: Benções de buff individual");

        do {
            try {
                switch (this.tipo = ler.nextInt()) {
                    case 1:
                        System.out.println("Benções de buff em grupo");
                        System.out.println("1: " + nomeGrupo[2]);
                        System.out.println("2: " + nomeGrupo[5]);
                        System.out.println("3: " + nomeGrupo[4]);
                        validacao = true;

                        do {
                            System.out.println("Escolha uma benção:");
                            escolhaBencao = ler.nextInt();

                            switch (escolhaBencao) {
                                case 1:
                                    System.out.println("Opção 1 selecionada: Deusa Panaceia");
                                    validacao = true;
                                    break;
                                case 2:
                                    System.out.println("Opção 2 selecionada: Rei druida Brennos");
                                    validacao = true;
                                    break;
                                case 3:
                                    System.out.println("Opção 3 selecionada: Rainha Elizabeth");
                                    validacao = true;
                                    break;
                                default:
                                    System.out.println("Escolha inválida");
                                    validacao = false;
                                    break;
                            }
                        } while (!validacao);

                        break;
                    case 2:
                        System.out.println("Benções de buff individual");
                        System.out.println("1: " + nomeGrupo[0]);
                        System.out.println("2: " + nomeGrupo[1]);
                        System.out.println("3: " + nomeGrupo[3]);
                        validacao = true;

                        do {
                            System.out.println("Escolha uma benção:");
                            escolhaBencao = ler.nextInt();

                            switch (escolhaBencao) {
                                case 1:
                                    System.out.println("Opção 1 selecionada: Dragão de fogo ancestral Ikkaros");
                                    validacao = true;
                                    break;
                                case 2:
                                    System.out.println("Opção 2 selecionada: Primeiro arquimago");
                                    validacao = true;
                                    break;
                                case 3:
                                    System.out.println("Opção 3 selecionada: Grande assassino Makael");
                                    validacao = true;
                                    break;
                                default:
                                    System.out.println("Escolha inválida");
                                    validacao = false;
                                    break;
                            }
                        } while (!validacao);

                        break;
                    default:
                        System.out.println("Escolha inválida");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Certifique-se de digitar um número inteiro.");
                ler.nextLine();
            }
        } while (!validacao);
    }
}
