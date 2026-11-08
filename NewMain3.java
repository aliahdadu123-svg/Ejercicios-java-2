import java.util.Scanner;

public class NewMain3 {

    public static void main(String[] args) {
        
    // Inicializamos el objeto Scanner para leer la entrada del teclado
        Scanner teclado=new Scanner(System.in);
        String contrasena;
        
        System.out.println("Introduce una contrasena");
         contrasena=teclado.nextLine();
    
// Bucle while para validar la contraseña de acceso
      while (!contrasena.equals("Davante123")){
           System.out.println("contrasena incorrecta.Intenntalo otra vez:");
           contrasena=teclado.nextLine();
           
     }
     System.out.println("Acceso permitido");
}
}
    

