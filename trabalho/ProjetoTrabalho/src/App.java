import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        atributos atri = new atributos();
        apresentacoes apre = new apresentacoes();
        skillsAtributos skill = new skillsAtributos();
        
        apre.getInicio();
        apre.getMensagemPersonagem();

        
        String valorNome = ler.nextLine();
        atri.setNome(valorNome);
        System.out.println("nome  do personagem é: " + valorNome);
        atri.EscolhaClasses();
        System.out.println("________________________________________");
        atri.EscolhaRaca();
        System.out.println("________________________________________");
        atri.EscolhaGenero();
       
        
        System.out.println("_______________________________");
       
    }
}
