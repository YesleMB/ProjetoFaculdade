
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.sql.Connection;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        ArrayList<atributos> listaDePersonagems = new ArrayList<>();
        int opcao;
        int contador = 1;
     

       
       

       do {
            System.out.println("===== MENU PRINCIPAL =====");
            System.out.println("1 - Criar Personagem");
            System.out.println("2 - Editar Personagem");
            System.out.println("3 - Excluir Personagem");
            System.out.println("4 - Listar Personagens");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = ler.nextInt();
            try {
                ler.nextLine();

                switch (opcao) {
                    case 1:
                        // Coletar os dados
                        atributos atri = new atributos();
                         bencaoDivina ben = new bencaoDivina();
                        itens item = new itens();
                        System.out.println("digite o nome do personagem:");
                        String valorNome = ler.nextLine();
                        atri.setNome(valorNome);
                        System.out.println("nome  do personagem é: " + valorNome);
                        atri.EscolhaRaca();
                        System.out.println("_________________________________________________________________");
                        atri.EscolhaClasses();
                        System.out.println("_________________________________________________________________");
                        atri.EscolhaGenero();
                        System.out.println("_________________________________________________________________");
                        item.escolhaItem();
                        System.out.println("_________________________________________________________________");
                        ben.tipoEscolha();
                        // atributos atri = new atributos();

                        listaDePersonagems.add(atri);
                       
                   

                        break;
                    case 2:
                        for (int i = 0; i < listaDePersonagems.size(); i++) {
                            atri = listaDePersonagems.get(i);
                            System.out.println("Personagem número: " + (i + 1));
                            System.out.println("Nome: " + atri.getNome());
                            System.out.println("_________________________________________________________________");
                            System.out.println("Raça: " + atri.getNomeRaca());
                            System.out.println("_________________________________________________________________");
                            System.out.println("Classe: " + atri.getNomeClasse());
                            System.out.println("_________________________________________________________________");
                            System.out.println("Gênero: " + atri.getNomeGenero());
                            System.out.println("_________________________________________________________________");
                            System.out.println("-----------------------------");
                        }

                        System.out.print("Digite o número do personagem que deseja editar: ");
                        System.out.println("!!!!ITENS E BENÇÃO DIVINA NAO PODEM SER AUTERADOS DEPOIS DA CRIAÇÃO!!!!");
                        int numeroPersonagem = ler.nextInt();
                        ler.nextLine();

                        if (numeroPersonagem >= 1 && numeroPersonagem <= listaDePersonagems.size()) {
                            atributos personagemSelecionado = listaDePersonagems.get(numeroPersonagem - 1);

                            System.out.println("Personagem selecionado:");
                            System.out.println("1 - Nome: " + personagemSelecionado.getNome());
                            System.out.println("2 - Raça: " + personagemSelecionado.getNomeRaca());
                            System.out.println("3 - Classe: " + personagemSelecionado.getNomeClasse());
                            System.out.println("4 - Gênero: " + personagemSelecionado.getNomeGenero());

                            System.out.print("Digite o número do personagem que deseja editar: ");
                            int numeroVariavel = ler.nextInt();
                            ler.nextLine();

                            switch (numeroVariavel) {
                                case 1:
                                    System.out.print("Digite o novo nome: ");
                                    String novoNome = ler.nextLine();
                                    personagemSelecionado.setNome(novoNome);
                                    break;
                                case 2:
                                    System.out.print("Digite a nova raça: ");
                                    int novaRaca = ler.nextInt();
                                    personagemSelecionado.setRaca(novaRaca);
                                    break;
                                case 3:
                                    System.out.print("Digite a nova classe: ");
                                    int novaClasse = ler.nextInt();
                                    personagemSelecionado.setClasse(novaClasse);
                                    break;
                                case 4:
                                    System.out.print("Digite o novo gênero: ");
                                    int novoGenero = ler.nextInt();
                                    personagemSelecionado.setGenero(novoGenero);
                                    break;
                                default:
                                    System.out.println("Opção inválida! Digite um número válido.");
                                    break;
                            }

                            System.out.println("Personagem editado com sucesso!");
                        } else {
                            System.out.println("Personagem não encontrado!");
                        }

                        break;

                    // Buscar personagem no banco
                    // Instanciar objeto
                    // Imprimir na tela com numeros ao lado de cada variável
                    // switch para editar a variável
                    // atualizar a variável no obj (set)
                    // salvar obj no bd

                    case 3:

                        for (int i = 0; i < listaDePersonagems.size(); i++) {
                            atri = listaDePersonagems.get(i);
                            System.out.println("Personagem número: " + (i + 1));
                            System.out.println("Nome: " + atri.getNome());
                            System.out.println("_________________________________________________________________");
                            System.out.println("Raça: " + atri.getNomeRaca());
                            System.out.println("_________________________________________________________________");
                            System.out.println("Classe: " + atri.getNomeClasse());
                            System.out.println("_________________________________________________________________");
                            System.out.println("Gênero: " + atri.getNomeGenero());
                            System.out.println("_________________________________________________________________");
                            System.out.println("-----------------------------");
                        }

                        System.out.print("Digite o número do personagem que deseja excluir: ");
                        int numeroPersonagemExcluir = ler.nextInt();
                        ler.nextLine();

                        if (numeroPersonagemExcluir >= 1 && numeroPersonagemExcluir <= listaDePersonagems.size()) {
                            listaDePersonagems.remove(numeroPersonagemExcluir - 1);
                            System.out.println("Personagem excluído com sucesso!");
                        } else {
                            System.out.println("Personagem não encontrado!");
                        }
                        break;
                    // Adicione a lógica para excluir um personagem

                    case 4:
                        for (int i = 0; i < listaDePersonagems.size(); i++) {
                            atributos atri2 = listaDePersonagems.get(i);
                            System.out.println("Personagem número: " + (i + 1));
                            // ...
                        }
                        break;

                    case 5:
                        System.out.println("Saindo do programa...");
                        break;
                    default:
                        System.out.println("Opção inválida! Digite um número válido.");
                        break;
                }
            } catch (InputMismatchException p) {
                System.out.println("opçao errada!!!!");
                ler.nextLine();
            }
        } while (opcao != 5);

    }

}
