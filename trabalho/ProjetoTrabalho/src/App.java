import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
    

        apresentacoes apre = new  apresentacoes();
            apre.getInicio();
            apre.getMensagemPersonagem();

        atributos atri = new atributos();
            String valorNome = ler.nextLine();
            atri.setNome(valorNome);
            System.out.println("nome  do personagem é: " + valorNome);
            atri.EscolhaClasses();
                        System.out.println("________________________________________");
            atri.EscolhaRaca();
                        System.out.println("________________________________________");
            atri.EscolhaGenero();
                        System.out.println("________________________________________");

       
        
        
    }
}
