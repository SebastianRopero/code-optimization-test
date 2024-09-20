import java.util.Scanner;

public class AgeValidation {
    public static void main(String[] args) {

         //hacemos un scanner para ingresar la edad
         Scanner scanner = new Scanner(System.in);

        // Creo la constante de la edad limite
        final int AGE_LIMIT = 18;

       //pedimos la edad por teclado con el scanner antes creado
        System.out.println("Ingrese su edad");
        int age = scanner.nextInt();

        //abrimos un if para saber si la edad ingresada es mayor o menor de la requerida
        if (age >= AGE_LIMIT) {
            System.out.println("Acceso garantizado");
        } else {
            System.out.println("Acceso denegado");
        }
        
       
    }
}