
import java.util.ArrayList;
import java.util.Scanner;

public class App   {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
       ArrayList<atributos>listaDePersonagems = new ArrayList<>();
      int opcao;
      int contador= 0;
      
        atributos atri = new atributos();
        apresentacoes apre = new apresentacoes();
        bencaoDivina  ben = new bencaoDivina();
        itens item = new itens();


        do {
        System.out.println("===== MENU PRINCIPAL =====");
        System.out.println("1 - Criar Personagem");
        System.out.println("2 - Editar Personagem");
        System.out.println("3 - Excluir Personagem");
        System.out.println("4 - Listar Personagens");
        System.out.println("5 - Sair");
        System.out.print("Escolha uma opção: ");
        opcao = ler.nextInt();
        ler.nextLine();
           switch(opcao){
            case 1:
            // Coletar os dados
        System.out.println("digite o nome do personagem:");   
        String valorNome = ler.nextLine();    
        atri.setNome(valorNome);
        System.out.println("nome  do personagem é: " + valorNome);
        atri.EscolhaRaca();
        System.out.println("________________________________________");
        atri.EscolhaClasses();
        System.out.println("________________________________________");
        atri.EscolhaGenero();
        System.out.println("________________________________________");
        item.escolhaItem();
        System.out.println("________________________________________");
        ben.tipoEscolha();
        // atributos atri = new atributos();
        listaDePersonagems.add(atri);
        
           // Adicionar o objeto atri (personagem) à lista
            
        
        // instanciar obj personagem
        // salvar objeto personagem no banco

            break;

            case 2:
            for(atributos atri2:listaDePersonagems ){
                System.out.println("Nome: " + atri.getNome());
                System.out.println("__________________________");
                System.out.println("Raça: " + atri.getRaca());
                System.out.println("__________________________");
                System.out.println("Classe: " + atri.getNomeClasse());
                System.out.println("__________________________");
                System.out.println("genero:" + atri.getGenero());
                System.out.println("__________________________");
                System.out.println("-----------------------------");

            }

            // Buscar personagem no banco
            // Instanciar objeto
            // Imprimir na tela com numeros ao lado de cada variável
            // switch para editar a variável
            // atualizar a variável no obj (set)
            // salvar obj no bd

            break;
            case 3:
                // Adicione a lógica para excluir um personagem
                break;
            case 4:
                // Adicione a lógica para listar os personagens
                break;
            case 5:
                System.out.println("Saindo do programa...");
                break;
            default:
                System.out.println("Opção inválida! Digite um número válido.");
                break;
        }
    } while (opcao != 5);

        
      
      
 
        

        
        
        
       
          
       
       

   }

  

   
}
