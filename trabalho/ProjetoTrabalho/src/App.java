
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import inimigos.atributosInimigos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App  {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        ArrayList<atributos> listaDePersonagems = new ArrayList<>();
        ArrayList<atributosInimigos> listaDeInimigos = new ArrayList<>();


        int opcao;
        do {
            System.out.println("===== MENU PRINCIPAL =====");
            System.out.println("1 - Criar Personagem");
            System.out.println("2 - criar inimigo");
            System.out.println("3 - Editar Personagem");
            System.out.println("4 - Excluir Personagem");
            System.out.println("5 - excluir inimigo");
            System.out.println("6 - Listar Personagens");
            System.out.println("7 - listar inimigos");
            System.out.println("8 - inicar jornada");
            System.out.println("9 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = ler.nextInt();
            try {
                ler.nextLine();

                switch (opcao) {
                    case 1:
                        // criar personagem
                        atributos atri = new atributos();
                        bencaoDivina ben = new bencaoDivina();
                        itens item = new itens();
                        Conexao link = new Conexao();

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
                        System.out.println("!!!!ITENS E BENÇÃO DIVINA NAO PODEM SER ALTERADOS DEPOIS DA CRIAÇÃO!!!!");
                        item.escolhaItem();
                        System.out.println("_________________________________________________________________");
                        ben.tipoEscolha();
                        // atributos atri = new atributos();

                        atri.cadastrar();
                        listaDePersonagems.add(atri);

                        break;

                    case 2: // criar inimigo
                    atributosInimigos ini = new atributosInimigos();
                    Conexao conex = new Conexao();
                   
                    System.out.println("comece a criaçao do inimigo:");
                    ini.EscolhaTipo();
                        System.out.println("_________________________________________________________________");
                   ini.EscolhaNomeInimigo();;
                        System.out.println("_________________________________________________________________");
                     ini.EscolhaRaca();
                        System.out.println("_________________________________________________________________");
                    ini.cadastrar();
                    listaDeInimigos.add(ini);

                      break;
                    
                    case 3: // editar personagem    
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
                            System.out.println("id personagem: " + atri.getId());
                            System.out.println("_________________________________________________________________");
                            System.out.println("-----------------------------");
                        }

                        System.out.print("Digite o número do personagem que deseja editar: ");
                        int numeroPersonagem = ler.nextInt();
                        ler.nextLine();

                        if (numeroPersonagem >= 1 && numeroPersonagem <= listaDePersonagems.size()) {
                            atributos personagemSelecionado = listaDePersonagems.get(numeroPersonagem - 1);

                            System.out.println("Personagem selecionado:");
                            System.out.println("1 - Nome: " + personagemSelecionado.getNome());
                            System.out.println("2 - Raça: " + personagemSelecionado.getNomeRaca());
                            System.out.println("3 - Classe: " + personagemSelecionado.getNomeClasse());
                            System.out.println("4 - Gênero: " + personagemSelecionado.getNomeGenero());

                            System.out.print("Digite o número da opção que deseja editar: ");
                            int numeroOpcao = ler.nextInt();
                            ler.nextLine();

                            switch (numeroOpcao) {
                                case 1:
                                    System.out.print("Digite o novo nome: ");
                                    String novoNome = ler.nextLine();
                                    personagemSelecionado.setNome(novoNome);
                                    personagemSelecionado.editar(personagemSelecionado.getId(), novoNome,
                                            personagemSelecionado.getRaca(), personagemSelecionado.getClasse(),
                                            personagemSelecionado.getGenero());
                                    break;
                                case 2:
                                    System.out.print("Digite a nova raça: ");
                                    int novaRaca = ler.nextInt();
                                    ler.nextLine();
                                    personagemSelecionado.setRaca(novaRaca);
                                    personagemSelecionado.editar(personagemSelecionado.getId(),
                                            personagemSelecionado.getNome(), novaRaca,
                                            personagemSelecionado.getClasse(), personagemSelecionado.getGenero());
                                    break;
                                case 3:
                                    System.out.print("Digite a nova classe: ");
                                    int novaClasse = ler.nextInt();
                                    ler.nextLine();
                                    personagemSelecionado.setClasse(novaClasse);
                                    personagemSelecionado.editar(personagemSelecionado.getId(),
                                            personagemSelecionado.getNome(), personagemSelecionado.getRaca(),
                                            novaClasse, personagemSelecionado.getGenero());
                                    break;
                                case 4:
                                    System.out.print("Digite o novo gênero: ");
                                    int novoGenero = ler.nextInt();
                                    ler.nextLine();
                                    personagemSelecionado.setGenero(novoGenero);
                                    personagemSelecionado.editar(personagemSelecionado.getId(),
                                            personagemSelecionado.getNome(), personagemSelecionado.getRaca(),
                                            personagemSelecionado.getClasse(), novoGenero);
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

                        case 4: // excluir personagem
                        listaDePersonagems =atributos.listarApenas();
                        if (!listaDePersonagems.isEmpty()) {
                            // Listar os personagens disponíveis para exclusão
                            System.out.println("Lista de Personagens:");
                            for (int i = 0; i < listaDePersonagems.size(); i++) {
                                atributos personagem = listaDePersonagems.get(i);
                                System.out.println("Personagem número: " );
                                System.out.println("Nome: " + personagem.getNome());
                                System.out.println("-----------------------------");
                            }
                    
                            System.out.print("Digite o número do personagem que deseja excluir: ");
                            int numeroPersonagemExcluir = ler.nextInt();
                            ler.nextLine();
                    
                            if (numeroPersonagemExcluir >= 1 && numeroPersonagemExcluir <= listaDePersonagems.size()) {
                                atributos personagemExcluir = listaDePersonagems.get(numeroPersonagemExcluir - 1);
                                int idPersonagemExcluir = personagemExcluir.getId();
                    
                                // Excluir o personagem do banco de dados
                                personagemExcluir.excluir(idPersonagemExcluir);
                    
                                // Remover o personagem da lista
                                listaDePersonagems.remove(numeroPersonagemExcluir - 1);
                    
                                System.out.println("Personagem excluído com sucesso!");
                            } else {
                                System.out.println("Personagem não encontrado!");
                            }
                        } else {
                            System.out.println("A lista de personagens está vazia!");
                        }
                        break;
                    
                        case 5: // excluir inimigo  
                        listaDeInimigos =atributosInimigos.listaParaDeletar();
                        if (!listaDeInimigos.isEmpty()) {
                            // Listar os personagens disponíveis para exclusão
                
                           
                    
                            System.out.print("Digite o número do personagem que deseja excluir: ");
                            int numeroInimigoExcluir = ler.nextInt();
                            ler.nextLine();
                            for (int i = 0; i < listaDeInimigos.size(); i++) {
                               atributosInimigos inimigos = listaDeInimigos.get(i);
                              
                            }
                            if (numeroInimigoExcluir >= 1 && numeroInimigoExcluir <= listaDeInimigos.size()) {
                                atributosInimigos listaInimigosExcluir = listaDeInimigos.get(numeroInimigoExcluir - 1);
                                int idInimigosExcluir = listaInimigosExcluir.getId();
                    
                                // Excluir o personagem do banco de dados
                                listaInimigosExcluir.excluir(idInimigosExcluir);
                    
                                // Remover o personagem da lista
                                listaDeInimigos.remove(numeroInimigoExcluir - 1);
                    
                                System.out.println("Personagem excluído com sucesso!");
                            } else {
                                System.out.println("Personagem não encontrado!");
                            }
                        } else {
                            System.out.println("A lista de personagens está vazia!");
                        }

                        break;
                    
                    case 7: // listar inimigos
                    
                    listaDeInimigos = atributosInimigos.listaInimigos();
                    if (!listaDeInimigos.isEmpty()) {
                        for (int i = 0; i < listaDeInimigos.size(); i++) {
                            atributosInimigos inimigo = listaDeInimigos.get(i);
                            
                        }
                    } else {
                        System.out.println("Não há inimigos cadastrados.");
                    }
                    break;
                
                    case 8: // inicar jornada 
                        break;
                    case 9:
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
        } while (opcao != 9);

    }

    
}
