 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.array;
import java.util.Scanner;
  import java.util.Random;
/**
 *
 * @author Alumno
 */
public class EjerciciosArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        //EJERCICIO 1
       /* int[] numeros = new int[10];
 
        System.out.println("Ingrese 10 numeros enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
 
        int sumaPos = 0, contPos = 0;
        int sumaNeg = 0, contNeg = 0;
 
        for (int n : numeros) {
            if (n > 0) { sumaPos += n; contPos++; }
            else if (n < 0) { sumaNeg += n; contNeg++; }
        }
 
        System.out.println("\n--- Resultados ---");
        if (contPos > 0)
            System.out.println("Media de positivos: " + (double) sumaPos / contPos);
        else
            System.out.println("No hay numeros positivos.");
 
        if (contNeg > 0)
            System.out.println("Media de negativos: " + (double) sumaNeg / contNeg);
        else
            System.out.println("No hay numeros negativos.");
        
        
       //EJERCICIO 2
  int[] numeros = new int[10];
 
        System.out.println("Ingrese 10 numeros enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Numero en posición " + i + ": ");
            numeros[i] = sc.nextInt();
        }
 
        int suma = 0, cont = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (i % 2 == 0) {  // posición 0, 2, 4, 6, 8 son pares
                suma += numeros[i];
                cont++;
            }
        }
 
        System.out.println("\nMedia de posiciones pares: " + (double) suma / cont);
         
          
        //EJERCICIO 3
 System.out.print("Ingrese el número de alumnos: ");
        int n = sc.nextInt();
        double[] notas = new double[n];
 
        // Recorrido 1: ingresar notas
        for (int i = 0; i < n; i++) {
            System.out.print("Nota del alumno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }
 
        // Recorrido 2: calcular la media
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        double media = suma / n;
        System.out.println("\nNota media del grupo: " + media);
 
        // Recorrido 3: mostrar alumnos con nota superior a la media
        System.out.println("Alumnos con nota superior a la media:");
        for (int i = 0; i < n; i++) {
            if (notas[i] > media) {
                System.out.println("  Alumno " + (i + 1) + ": " + notas[i]);
            }
        }
 

        //EJERCICIO 4  
          int[] pares = new int[20];
 
        for (int i = 0; i < 20; i++) {
            pares[i] = (i + 1) * 2;
        }
 
        System.out.println("Los 20 primeros números pares:");
        for (int i = 0; i < pares.length; i++) {
            System.out.println("Pares[" + i + "] = " + pares[i]);
        }

        //EJERCICIO 5

   int[] numeros = new int[10];
 
        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
 
        int positivos = 0, negativos = 0, ceros = 0;
        for (int n : numeros) {
            if (n > 0)      positivos++;
            else if (n < 0) negativos++;
            else            ceros++;
        }
 
        System.out.println("\n--- Resultados ---");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros:     " + ceros);


         
         //EJERCICIO 6
int[] numeros = new int[10];
 
        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
 
        double sumaPos = 0, sumaNeg = 0;
        int contPos = 0, contNeg = 0;
 
        for (int n : numeros) {
            if (n > 0) { sumaPos += n; contPos++; }
            else if (n < 0) { sumaNeg += n; contNeg++; }
        }
 
        System.out.println("\n--- Resultados ---");
        if (contPos > 0)
            System.out.printf("Media de valores positivos: %.2f%n", sumaPos / contPos);
        else
            System.out.println("No se ingresaron valores positivos.");
 
        if (contNeg > 0)
            System.out.printf("Media de valores negativos: %.2f%n", sumaNeg / contNeg);
        else
            System.out.println("No se ingresaron valores negativos.");


            //EJERCICIO 7
 int[] numeros = new int[10];
 
        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
 
        double sumaPos = 0, sumaNeg = 0;
        int contPos = 0, contNeg = 0;
 
        for (int n : numeros) {
            if (n > 0) {
                sumaPos += n;
                contPos++;
            } else if (n < 0) {
                sumaNeg += n;
                contNeg++;
            }
        }
 
        System.out.println("\n--- Resultados ---");
        if (contPos > 0)
            System.out.printf("Media de valores positivos: %.2f%n", sumaPos / contPos);
        else
            System.out.println("No se ingresaron valores positivos.");
 
        if (contNeg > 0)
            System.out.printf("Media de valores negativos: %.2f%n", sumaNeg / contNeg);
        else
            System.out.println("No se ingresaron valores negativos.");
         
         //EJERCICIO 8
 String[] nombres = new String[20];
        double[] sueldos = new double[20];
 
        System.out.println("Ingrese los datos de 20 empleados:");
        for (int i = 0; i < 20; i++) {
            System.out.print("\nEmpleado " + (i + 1) + " - Nombre: ");
            nombres[i] = sc.next();
            System.out.print("Empleado " + (i + 1) + " - Sueldo: ");
            sueldos[i] = sc.nextDouble();
        }
 
        // Tomamos el primero como mayor y comparamos con el resto
        int indiceMayor = 0;
        for (int i = 1; i < 20; i++) {
            if (sueldos[i] > sueldos[indiceMayor]) {
                indiceMayor = i;
            }
        }
 
        System.out.println("\n--- Empleado con mayor sueldo ---");
        System.out.println("Nombre: " + nombres[indiceMayor]);
        System.out.printf("Sueldo: %.2f%n", sueldos[indiceMayor]);
 */
        //EJERCICIO 9
  
       

        int desde = 1;

        int hasta = 10;

        int tamaño = 5;

        int[] resultado = generarArraySinRepetidos(desde, hasta, tamaño);

        for (int num : resultado) {

            System.out.print(num + " ");

        }

        }

        public static int[] generarArraySinRepetidos(int desde, int hasta, int tamaño) {

        if (tamaño > (hasta - desde + 1)) {

            throw new IllegalArgumentException("No se pueden generar tantos números sin repetir en ese rango");

        }

        int[] array = new int[tamaño];

        Random rm = new Random();

        int i = 0;

        while (i < tamaño) {

            int numAleatorio = rm.nextInt(hasta - desde + 1) + desde;

            if (!comprobarSiContiene(array, i, numAleatorio)) {

                array[i] = numAleatorio;

                i++;

            }

        }

        return array;

        }

        public static boolean comprobarSiContiene(int[] array, int posicionActual, int numero) {

        for (int i = 0; i < posicionActual; i++) {

            if (array[i] == numero) {

                return true;

            }

        }

        return false;
        



    }
    
}
