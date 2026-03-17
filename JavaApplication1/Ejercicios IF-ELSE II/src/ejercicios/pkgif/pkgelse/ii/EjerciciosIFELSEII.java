/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.pkgif.pkgelse.ii;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class EjerciciosIFELSEII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        // TODO code application logic here
        
    
    
       
//EJERCICIO 1
        //System.out.print("Ingrese su edad: ");
        //int edad = sc.nextInt();

       // if (edad >= 18) {
           // System.out.println("Es mayor de edad"); } else {
           // System.out.println("No es mayor de edad");}
        
        
           
           //EJERCICIO 2
        //String contraseñaGuardada = "Hola123";

        //System.out.print("Ingrese la contraseña: ");
        //String contraseña = sc.nextLine();

        //if (contraseña.equalsIgnoreCase(contraseñaGuardada)) {
            //System.out.println("Contraseña correcta");} else {
            //System.out.println("Contraseña incorrecta");}
        
            
            
            //EJERCICIO 3
            //System.out.print("Ingrese el primer numero: ");
        //double num1 = sc.nextDouble();

        //System.out.print("Ingrese el segundo numero: ");
        //double num2 = sc.nextDouble();

        //if (num2 == 0) {
            //System.out.println("Error: no se puede dividir por cero");} else {
            //double resultado = num1 / num2;
            //System.out.println("Resultado: " + resultado);}
            
            
            //EJERCICIO 4
               //System.out.print("Ingrese su edad: ");
        //int edad = sc.nextInt();

        //System.out.print("Ingrese sus ingresos mensuales: ");
        //double ingresos = sc.nextDouble();

        //if (edad > 16 && ingresos >= 1000) {
            //System.out.println("Debe tributar");} else {
            //System.out.println("No debe tributar");}
            
            
            //EJERCICIO 5
            
        //System.out.print("Ingrese su puntuación: ");
        //double puntos = sc.nextDouble();

        //String nivel;
        //double dinero;

        //if (puntos == 0.0) {
            //nivel = "Inaceptable";} else if (puntos == 0.4) {
            //nivel = "Aceptable";} else if (puntos >= 0.6) {
            //nivel = "Meritorio";} else {
            //nivel = "Puntuación inválida";}

        //dinero = puntos * 2400;

        //System.out.println("Nivel: " + nivel);
        //System.out.println("Dinero recibido: $" + dinero);}
    
        
        
        //EJERCICIO 6
        
        
        
        //System.out.print("Ingrese la edad del cliente: ");
        //int edad = sc.nextInt();

        //double precio;

        //if (edad < 4) {precio = 0;} 
//else if (edad >= 4 && edad <= 18) {precio = 5;} 
        //else {precio = 10;}

        //System.out.println("El precio de la entrada es: $" + precio);
        
        
        
        
        //EJERCICIO 7
         System.out.print("¿Quiere una pizza vegetariana? (si/no): ");
        String opcion = sc.nextLine();

        String ingrediente = "";

        if (opcion.equalsIgnoreCase("si")) {
            System.out.println("Ingredientes vegetarianos disponibles:");
            System.out.println("1. Pimiento");
            System.out.println("2. Tofu");

            System.out.print("Elija un ingrediente (1 o 2): ");
            int eleccion = sc.nextInt();

            if (eleccion == 1) {
                ingrediente = "Pimiento";
            } else if (eleccion == 2) {
                ingrediente = "Tofu";
            }

            System.out.println("Pizza vegetariana con mozzarella, tomate y " + ingrediente);

        } else {
            System.out.println("Ingredientes no vegetarianos disponibles:");
            System.out.println("1. Peperoni");
            System.out.println("2. Jamón");
            System.out.println("3. Salmón");

            System.out.print("Elija un ingrediente (1, 2 o 3): ");
            int eleccion = sc.nextInt();

            if (eleccion == 1) {
                ingrediente = "Peperoni";
            } else if (eleccion == 2) {
                ingrediente = "Jamón";
            } else if (eleccion == 3) {
                ingrediente = "Salmón";
            }

            System.out.println("Pizza no vegetariana con mozzarella, tomate y " + ingrediente);
        }
    }
}

        
        
        
        
  
