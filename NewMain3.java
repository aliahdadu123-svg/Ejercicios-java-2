import java.util.Scanner;

public class NewMain3 {

    public static void main(String[] args) {
        
    
        Scanner teclado=new Scanner(System.in);
        String contrasena;
        
        System.out.println("Introduce una contrasena");
         contrasena=teclado.nextLine();
    

      while (!contrasena.equals("Davante123")){
           System.out.println("contrasena incorrecta.Intenntalo otra vez:");
           contrasena=teclado.nextLine();
           
     }
     System.out.println("Acceso permitido");
}
}
    

