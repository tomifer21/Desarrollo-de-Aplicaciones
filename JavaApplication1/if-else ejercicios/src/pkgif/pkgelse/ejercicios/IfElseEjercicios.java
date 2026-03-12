/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgif.pkgelse.ejercicios;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class IfElseEjercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner teclado = new Scanner (System.in);
        
    //EJERCICIO NUMERO 1 
    //System.out.print("Escribe el primer numero: ");
//int num1 = teclado.nextInt();

//System.out.print("Escribe el segundo numero: ");
//int num2 = teclado.nextInt();

//if (num1 == num2){System.out.println("Tus numeros son iguales");}
//else {System.out.println("Tus numeros son diferentes");}
        
    
   //EJERCICIO NUMERO 2
  // System.out.print("Escribe el primer numero: ");
   //int num1 = teclado.nextInt();
   
   //System.out.print("Escribe el segundo numero: ");
   //int num2 = teclado.nextInt();
   
   //if (num1 > num2){System.out.println("El primer numero es mayor");}
   //else if (num2 > num1){System.out.println("El segundo numero es mayor");}
   //else if (num2 == num1){System.out.println("Los dos numeros son iguales");}

    
   
   //EJERCICIO NUMERO 3
   //System.out.print("Escribe el primer numero: ");
//int num1 = teclado.nextInt();
   
//System.out.print("Escribe el segundo numero: ");
//int num2 = teclado.nextInt();

//int cifra1 = num1 % 10;
//int cifra2 = num2 % 10;

  //if (cifra1 == cifra2) {
            //System.out.println("Los dos numeros terminan con la misma cifra");} 
//else {System.out.println("Los numeros terminan con cifras diferentes");}



//EJERCICIO NUMERO 4
 //System.out.print("Ingrese un numero: ");
       // int num = teclado.nextInt();

       // if (num % 3 == 0 && num % 5 == 0) { System.out.println("El numero es multiplo de 3 y de 5");}
        //else if (num % 3 == 0) {System.out.println("El numero es multiplo de 3");}
        //else if (num % 5 == 0) {System.out.println("El numero es multiplo de 5");} 
        //else {System.out.println("El numero no es multiplo de 3 ni de 5");}
        
        
        
        
        //EJERCICIO NUMERO 5
           //System.out.print("Ingrese un año: ");
        //int año = teclado.nextInt();

        //if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0) {
            //System.out.println("El año es bisiesto");}
        //else {System.out.println("El año no es bisiesto");}
        

        
        //EJERCICIO NUMERO 6
        //System.out.print("Ingresa el primer numero: ");
        //int num1 = teclado.nextInt();

        //System.out.print("Ingresa el segundo numero: ");
        //int num2 = teclado.nextInt();

        //System.out.print("Ingresa el tercer numero: ");
        //int num3 = teclado.nextInt();
        
        //int mayor = num1; 
        //if (num2 > mayor) {mayor = num2;}
        //if (num3 > mayor) {mayor = num3;}
        
        //System.out.println("El numero mayor de los tres es: " + mayor);
        
        
        //EJERCICIO NUMERO 7
         System.out.print("Introduce una nota numerica (0-10): ");
        double nota = teclado.nextDouble();

      
                
        if (nota < 0 || nota > 10) {
            System.out.println("Error: La calificación introducida no es valida.");
        } else {
            
            String resultado = "";

            if (nota >= 0 && nota < 5) {
                resultado = "Insuficiente";
            } else if (nota >= 5 && nota < 6) {
                resultado = "Suficiente";
            } else if (nota >= 6 && nota < 7) {
                resultado = "Bien";
            } else if (nota >= 7 && nota < 9) {
                resultado = "Notable";
            } else if (nota >= 9 && nota <= 10) {
                resultado = "Sobresaliente";
            }

            
            System.out.println("La calificacion alfabetica es: " + resultado);
        }

        
    }
    
}
