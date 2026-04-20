/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.pkgwhile.pkgfor;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class EjerciciosWhileFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        //EJERCICIO 1
       //WHILE 
        //int i = 1;
        //while (i <= 100) {
            //System.out.println(i); i++;}
        
            //DOWHILE
            //int x = 1;
        //do {System.out.print(x); x++;} 
        //while (x <= 100);
            

            
        //FOR
        //for (int a = 1; a <= 100; a++) {
            //System.out.println(a);}
            
            
        //EJERCICIO 2
        
        //WHILE 
        //System.out.println("Ingrese un numero: ");
        //int N = sc.nextInt();
        //int i = 1;
        //while (i <= N) {
            //System.out.println(i); i++;}

        
            //DOWHILE
            //System.out.println("Ingrese un numero: ");
            //int N = sc.nextInt();

            //int i = 1;
        //do {System.out.println(i); i++;} while (i <= N);
        
        
        //FOR
         //System.out.print("Ingrese un numero: ");
        //int N = sc.nextInt();

        //for (int i = 1; i <= N; i++) {System.out.println(i);}
        
        
        
       //EJERCICIO 3

        //WHILE
       // System.out.print("Ingrese un numero: ");
        //int a = sc.nextInt();
        //while (a>=1){System.out.println(a); a--;}
        
        //DOWHILE
       //System.out.print("Ingrese un numero: ");
        //int x = sc.nextInt();
        //do{System.out.println(x); x--;} while (x>=1);
        
        //FOR
        //System.out.print("Ingrese un numero: ");
        //for (int a = sc.nextInt(); a>=1;a-- )
        //{System.out.println(a);}
        
        
        //EJERCICIO 4
        //WHILE
        //int a, b;
        //System.out.print("Ingrese el primer numero: ");
        //a = sc.nextInt();
        //System.out.print("Ingrese el segundo numero: ");
        //b = sc.nextInt();

       // while (a == b) {
            //System.out.println("Los numeros no pueden ser iguales. Intente de nuevo.");
            //System.out.print("Ingrese el primer numero: ");
            //a = sc.nextInt();
           // System.out.print("Ingrese el segundo numero: ");
           // b = sc.nextInt();}

       // int menor = Math.min(a, b);
       // int mayor = Math.max(a, b);

       // int i = menor;
       // while (i <= mayor) {System.out.println(i);i++;}
        
        //DOWHILE
        //int a, b;

        //do {
            //System.out.print("Ingrese el primer numero:");
            //a = sc.nextInt();
            //System.out.print("Ingrese el segundo numero:");
           // b = sc.nextInt();

            //if (a == b)
                //System.out.println("Los numeros no pueden ser iguales. Intente de nuevo.");}
                //while (a == b);

        //int i = Math.min(a, b);
        //int fin = Math.max(a, b);

        //do {System.out.println(i);i++;} while (i <= fin);
        
        //FOR
        //int a, b;
        //do {
            //System.out.print("Ingrese el primer numero:");
            //a = sc.nextInt();
            //System.out.print("Ingrese el segundo numero:");
            //b = sc.nextInt();

            //if (a == b)
                //System.out.println("Los numeros no pueden ser iguales. Intente de nuevo.");}
           // while (a == b);

       // for (int i = Math.min(a, b); i <= Math.max(a, b); i++)
        //{System.out.println(i);}
             
        
        //EJERCICIO 5
        //WHILE
        
         //int A, B;

        //System.out.print("Ingrese A: ");
       // A = sc.nextInt();
       // System.out.print("Ingrese B: ");
       // B = sc.nextInt();

       // while (A >= B) {
           // System.out.println("A debe ser menor que B");
           // System.out.print("Ingrese A y B: ");
           // A = sc.nextInt();
           // B = sc.nextInt();}

        //int i = A + 1;
       // while (i < B) {
            //if (i % 2 == 0)
               // System.out.println(i); i++;}
               
               //DOWHILE
          //int A, B;

        //do {
            //System.out.print("Ingrese A: ");
            //A = sc.nextInt();
            // System.out.print("Ingrese B: ");
            //B = sc.nextInt();

           // if (A >= B)
                //System.out.println("A debe ser menor que B");

       // } while (A >= B);

       // int i = A + 1;
       // do {
           // if (i % 2 == 0)
               // System.out.println(i); i++;} while (i < B);
               
               //FOR
                //int A, B;

        //do {
            //System.out.print("Ingrese A: ");
           // A = sc.nextInt();
            // System.out.print("Ingrese B: ");
           // B = sc.nextInt();

           // if (A >= B)
               // System.out.println("A debe ser menor que B");

       // } while (A >= B);

       // for (int i = A + 1; i < B; i++) {
            //if (i % 2 == 0)
               // System.out.println(i);}
               
               //EJERCICIO 6
               //WHILE
                // int N = 0, M = 0;
       // boolean valido = false;

     
       // while (!valido) {
            //System.out.print("Ingrese N (entero positivo): ");
            //if (sc.hasNextInt()) {
               // N = sc.nextInt();
               // if (N > 0) valido = true;
              //  else System.out.println("N debe ser positivo. Intente de nuevo.");
         //   } else {
              //  System.out.println("Valor no válido. Intente de nuevo.");
              //  sc.next();
          //  }
      //  }

     //  valido = false;

      
       // while (!valido) {
          //  System.out.print("Ingrese M (debe ser mayor que N): ");
          //  if (sc.hasNextInt()) {
             //   M = sc.nextInt();
              //  if (M > N) valido = true;
              //  else System.out.println("M debe ser mayor que N. Intente de nuevo.");
         //   } else {
             //   System.out.println("Valor no válido. Intente de nuevo.");
             //   sc.next();
          //  }
      //  }

       
      //  System.out.println("Multiplos de " + N + " hasta " + M + ":");
      //  int i = N;
       // while (i <= M) {
           // System.out.print(i + " ");
          //  i += N;
      //  }
       // System.out.println();
       
       //DOWHILE
      // int N, M;

        
      //  do {
           // System.out.print("Ingrese N (entero positivo): ");
           // while (!sc.hasNextInt()) {
             //   System.out.println("Valor no válido. Intente de nuevo.");
            //    sc.next();
            //    System.out.print("Ingrese N (entero positivo): ");
          //  }
          //  N = sc.nextInt();
          //  if (N <= 0) System.out.println("N debe ser positivo. Intente de nuevo.");
       // } while (N <= 0);

        
      //  do {
          //  System.out.print("Ingrese M (debe ser mayor que N): ");
          //  while (!sc.hasNextInt()) {
             //   System.out.println("Valor no válido. Intente de nuevo.");
             //   sc.next();
           //     System.out.print("Ingrese M (debe ser mayor que N): ");
          //  }
          //  M = sc.nextInt();
          //  if (M <= N) System.out.println("M debe ser mayor que N. Intente de nuevo.");
       // } while (M <= N);

        
       // System.out.println("Múltiplos de " + N + " hasta " + M + ":");
       // int i = N;
        //do {
          //  System.out.print(i + " ");
          //  i += N;
        //} while (i <= M);
       // System.out.println();
       
       //FOR
     //  int N = 0, M = 0;

        
      //  for (;;) {
           // System.out.print("Ingrese N (entero positivo): ");
           // if (sc.hasNextInt()) {
             //   N = sc.nextInt();
             //   if (N > 0) break;
              //  System.out.println("N debe ser positivo. Intente de nuevo.");
          //  } else {
              //  System.out.println("Valor no válido. Intente de nuevo.");
              //  sc.next();
         //   }
      //  }

        // Validar M usando for (bucle infinito con break)
      //  for (;;) {
         //   System.out.print("Ingrese M (debe ser mayor que N): ");
          //  if (sc.hasNextInt()) {
             //   M = sc.nextInt();
             //   if (M > N) break;
             //   System.out.println("M debe ser mayor que N. Intente de nuevo.");
         //   } else {
              //  System.out.println("Valor no válido. Intente de nuevo.");
              //  sc.next();
          //  }
      //  }

     
       // System.out.println("Multiplos de " + N + " hasta " + M + ":");
      //  for (int i = N; i <= M; i += N) {
          //  System.out.print(i + " ");
       // }
        //System.out.println();
        
        
        //EJERCICIO 7
        //WHILE
       // double millas;

       // System.out.print("Ingrese millas (0 para salir): ");
       // millas = sc.nextDouble();

        
       // while (millas != 0) {
           // double km = millas * 1.6093;
           // System.out.printf("%.2f millas = %.2f kilometros%n", millas, km);
           // System.out.print("Ingrese millas (0 para salir): ");
           // millas = sc.nextDouble();
        //}

       // System.out.println("Programa finalizado.");
       
       //DOWHILE
        //double millas;

       
       // do {
           // System.out.print("Ingrese millas (0 para salir): ");
           // millas = sc.nextDouble();

          //  if (millas != 0) {
               // double km = millas * 1.6093;
               // System.out.printf("%.2f millas = %.2f kilometros%n", millas, km);
          //  }
     //   } while (millas != 0);

       // System.out.println("Programa finalizado.");
       
       //FOR
        // double millas = -1; 

      
       // for (;;) {
           // System.out.print("Ingrese millas (0 para salir): ");
           // millas = sc.nextDouble();

           // if (millas == 0) break;

           // double km = millas * 1.6093;
           // System.out.printf("%.2f millas = %.2f kilometros%n", millas, km);
      //  }

       // System.out.println("Programa finalizado.");
    }
    
}
