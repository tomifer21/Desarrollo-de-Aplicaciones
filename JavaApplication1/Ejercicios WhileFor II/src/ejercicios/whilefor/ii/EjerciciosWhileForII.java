/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.whilefor.ii;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class EjerciciosWhileForII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        
        //EJERCICIO 1
        //WHILE
         //char c;

        //System.out.println("Ingrese caracteres (espacio para separar):");

        //while (sc.hasNext()) {
           // String linea = sc.next();
           // c = linea.charAt(0);

           // if (c == ' ') break;

           // char lower = Character.toLowerCase(c);
           // if (lower == 'a' || lower == 'e' || lower == 'i'
                  //  || lower == 'o' || lower == 'u') {
               // System.out.println("VOCAL");
          //  } else {
              //  System.out.println("NO VOCAL");
          //  }
      //  }
        
      
      //DOWHILE
      //char c;

       // System.out.println("Ingrese caracteres (espacio para terminar):");

       // do {
           // System.out.print("Caracter: ");
           //String linea = sc.nextLine();

           
          //  if (linea.isEmpty() || linea.charAt(0) == ' ') break;

           // c = linea.charAt(0);
           // char lower = Character.toLowerCase(c);

           // if (lower == 'a' || lower == 'e' || lower == 'i'
                  //  || lower == 'o' || lower == 'u') {
               // System.out.println("VOCAL");
          //  } else {
           //     System.out.println("NO VOCAL");
          // }

      //  } while (true);
        
        //FOR
         //System.out.println("Ingrese caracteres (espacio para terminar):");

       // for (String linea = sc.nextLine();
            // !linea.isEmpty() && linea.charAt(0) != ' ';
            // linea = sc.nextLine()) {

            //char c = linea.charAt(0);
           // char lower = Character.toLowerCase(c);

           // if (lower == 'a' || lower == 'e' || lower == 'i'
              //      || lower == 'o' || lower == 'u') {
             //   System.out.println("VOCAL");
          //  } else {
             //   System.out.println("NO VOCAL");
          //  }
       // }

        //EJERCICIO 2
        //WHILE
        
          //System.out.print("Base (real): ");
       // double base = sc.nextDouble();

        //System.out.print("Exponente (entero positivo): ");
        //int exp = sc.nextInt();

       // double resultado = 1;
        //int i = 0;

       // while (i < exp) {
            //resultado *= base;
          //  i++;
      //  }

      //  System.out.println(base + " ^ " + exp + " = " + resultado);
        
        
        //DOWHILE
        // System.out.print("Base (real): ");
        //double base = sc.nextDouble();

       // System.out.print("Exponente (entero positivo): ");
       // int exp = sc.nextInt();

        //double resultado = 1;
       // int i = 0;

       // if (exp == 0) {
          
           // System.out.println(base + " ^ 0 = 1.0");
      //  } else {
          //  do {
            //    resultado *= base;
           //     i++;
            //} while (i < exp);

           // System.out.println(base + " ^ " + exp + " = " + resultado);
      //  }
      
      
      //FOR
      
       // System.out.print("Base (real): ");
        //double base = sc.nextDouble();

       // System.out.print("Exponente (entero positivo): ");
       // int exp = sc.nextInt();

       // double resultado = 1;

        //for (int i = 0; i < exp; i++) {
        //    resultado *= base;
        //}

        //System.out.println(base + " ^ " + exp + " = " + resultado);
        
        
        //EJERCICIO 3
        //WHILE 
        
       // System.out.print("Pago del primer mes (€): ");
       // double pagoMes = sc.nextDouble();

       // System.out.print("Razon de crecimiento (ej. 2 para duplicar): ");
        //double razon = sc.nextDouble();

        //System.out.print("Número de meses: ");
        //int meses = sc.nextInt();

        //double total = 0;
        //int mes = 1;

        //while (mes <= meses) {
          //  System.out.printf("Mes %2d: %.2f €%n", mes, pagoMes);
            //total += pagoMes;
            //pagoMes *= razon;
            //mes++;
        //}

        //System.out.printf("%nTotal a pagar: %.2f €%n", total);
        
        
        //DOWHILE
        // System.out.print("Pago del primer mes (€): ");
       // double pagoMes = sc.nextDouble();

       // System.out.print("Razón de crecimiento (ej. 2 para duplicar): ");
       // double razon = sc.nextDouble();

       // System.out.print("Número de meses: ");
       // int meses = sc.nextInt();

       // double total = 0;
       // int mes = 1;

       // do {
          //  System.out.printf("Mes %2d: %.2f €%n", mes, pagoMes);
          //  total += pagoMes;
          //  pagoMes *= razon;
          //  mes++;
       // } while (mes <= meses);

       // System.out.printf("%nTotal a pagar: %.2f €%n", total);
        
       
       //FOR
        // System.out.print("Pago del primer mes (€): ");
        //double pagoMes = sc.nextDouble();

        //System.out.print("Razón de crecimiento (ej. 2 para duplicar): ");
       // double razon = sc.nextDouble();

       // System.out.print("Número de meses: ");
        //int meses = sc.nextInt();

       // double total = 0;

       // for (int mes = 1; mes <= meses; mes++) {
          //  System.out.printf("Mes %2d: %.2f €%n", mes, pagoMes);
          //  total += pagoMes;
          //  pagoMes *= razon;
      //  }

        //System.out.printf("%nTotal a pagar: %.2f €%n", total);
        
        
        //EJERCICIO 4
        //WHILE
         // int n = 100;

       // while (n >= 0) {
           // System.out.println(n);
           // n -= 23;
       // }
       
       //DOWHIE
        // int n = 100;

       // do {
           // System.out.println(n);
          //  n -= 23;
        //} while (n >= 0);
        
        
        //FOR
        // for (int n = 100; n >= 0; n -= 23) {
           // System.out.println(n);
       // }
       
       
       //EJERCICIO 5
       //WHILE
         //int tabla = 1;

       // while (tabla <= 10) {
           // System.out.println("Tabla del " + tabla);
           // System.out.println("----------------");

            //int factor = 1;
           // while (factor <= 10) {
               // System.out.println(tabla + " x " + factor + " = " + (tabla * factor));
               // factor++;
           // }

           // System.out.println(); // línea en blanco entre tablas
           // tabla++;
        //}
       
        
        //DOHILE
         // int tabla = 1;

      //  do {
           // System.out.println("Tabla del " + tabla);
          //  System.out.println("----------------");

          //  int factor = 1;
           // do {
               // System.out.println(tabla + " x " + factor + " = " + (tabla * factor));
              //  factor++;
           // } while (factor <= 10);

           // System.out.println();
           // tabla++;
        //} while (tabla <= 10);
       
        
        //FOR
          //for (int tabla = 1; tabla <= 10; tabla++) {
           //System.out.println("Tabla del " + tabla);
            //System.out.println("----------------");

           // for (int factor = 1; factor <= 10; factor++) {
                //System.out.println(tabla + " x " + factor + " = " + (tabla * factor));
           // }

           // System.out.println();
        //}
        
    }
    
}
