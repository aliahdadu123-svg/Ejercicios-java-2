import java.util.Scanner;


public class NewMain2 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double nota;
        int suma=0;
        int contador=1;
        double notamaxima=0;
        double numeros=0;
        <!--pedir nota de los alumnos-->
        do{
           System.out.println("Dame nota de los alumnos: ");
           nota=teclado.nextDouble();
           if(nota>0){
             suma+=nota;
             contador++;
             
           if (contador == 1 || nota > notamaxima) {
            notamaxima = nota;
         }
           if (contador>0&& nota>5){
               numeros=nota;
               
               
           }
           }
        }while (nota>0);
        
        double media=suma/contador;
        System.out.println("La media es:" +media);
        System.out.println("La nota mas alta es :" + notamaxima);
        System.out.println("Los numeros de alumnos evaluados :" +numeros);
        
        
                  }
            
        }
         
        
    
    
          
    
    

   
