import java.util.Scanner;
import java.util.InputMismatchException;
public class execao {

    public static void main(String[]args){
       final Scanner vai = new Scanner(System.in);
         boolean erro= false;
        int[] teste = new int[4];
        do{ 
        try{
                System.out.println("antes da exception");
            for( int valorUser = 0; valorUser<5; valorUser++)
            {   
                System.out.println("informe um numero");
                teste[valorUser] = vai.nextInt();
            }
            
           


                System.out.println("esse texto nao sera impresso");
            }
            catch(ArrayIndexOutOfBoundsException ae){
                System.out.println("posiçao nao existe mane");
                erro=true;
            }
            catch(java.util.InputMismatchException o){
                System.out.println("isso nao pode, é so numero"+ o);
                erro=true;
                vai.nextLine();
            }
            catch(Throwable ba){
                System.out.println("muitos erros");
            }
        }while(erro);
    }
    
}
 