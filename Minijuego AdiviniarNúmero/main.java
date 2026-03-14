import java.util.Random;
import java.util.Scanner;

public class proyecto1 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         Random random = new Random();

         System.out.println("Bienvenido al juego de adivinar el número");
         System.out.println("Selecciona la dificultad");
         System.out.println("1. Fácil");
         System.out.println("2. Normal");
         System.out.println("3. Dificil");
         System.out.print("Opción: ");

         int dificultad = sc.nextInt();
         int limiteMáximo;
         



        if (dificultad == 1) {
            limiteMáximo = 50;
        }else if (dificultad == 2){
            limiteMáximo = 100;
        }else {
            limiteMáximo = 500;
        }

        int numeroSecreto = random.nextInt(limiteMáximo) + 1;
        int intento;
        int contadorIntentos = 0;

        System.out.println("Estoy pensando en un número entre 1 y " + limiteMáximo);
        
        
        do { 
            
        
        System.out.print("Introduce tu intento:");
        intento = sc.nextInt();
        contadorIntentos++;

        if(intento < numeroSecreto){
            System.out.println("Te has quedado corto");
        }else if(intento > numeroSecreto){
            System.out.println("Te has pasado");
        }else{
            System.out.println("Has acertado");
        }

    } while (intento != numeroSecreto); 



     System.out.println("Has acertado en "+ contadorIntentos + " intentos.");

    sc.close();
        

       
        
    }
}

