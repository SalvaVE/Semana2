 /*
Hacer un programa que calcule el valor del DAI (Derecho Arancelario a la Importación) para un vehículo del año 2010
utilizando la siguiente fórmula:
DAI = (Valor Vehículo en USA – Depreciación - Flete – Seguro) * 0.25
Depreciación = Valor Vehículo en USA * 0.10

El programa deberá permitir ingresar vía teclado los valores para el valor del vehículo en USA, flete y seguro. Por el momento
el porcentaje de la depreciación será constante. Para efectos de prueba puede utilizar los siguientes valores: 

Valor USA = 5000, Depreciación = 10%, Flete = 700, Seguro = 100.
Imprimir los valores capturados así como el monto del DAI. 
*/

package metodos;

import java.util.Scanner;

public class ValorDAI {
    
    
     public static void main(String [] args) {
         DAI () ;
     }
     
     public static void DAI () {
         Scanner leer  = new Scanner (System.in);
         
         double ValorV, Flete, Seguro;
         
         System.out.println("Digite el valor del vehiculo: ");
         ValorV = leer.nextDouble();
         
         System.out.println("Digite el valor del Flete: ");
         Flete = leer.nextDouble();
         
         System.out.println("Digite el valor del seguro: ");
         Seguro = leer.nextDouble();
         
         double ValorD = ValorDAI.Depreciacion (ValorV);
         double RDAI = ValorDAI.ResultadoDAI (ValorV, ValorD, Flete, Seguro);
         
          System.out.println("El valor del Vehículo es: " + ValorV);
          System.out.println("El valor de la Depreciacion es: " + ValorD);
          System.out.println("El valor del Flete es: " + Flete);
          System.out.println("El valor del Seguro es: " + Seguro);
         System.out.println("El valor del DAI es: " + RDAI);
         
     }
     public static double Depreciacion (double ValorV){
         double depreciacion = 0;
         
         depreciacion = ValorV * 0.1;
         
      return depreciacion;   
     }
     
     public static double ResultadoDAI (double ValorV,double ValorD,double Flete,double Seguro){
         
         double DAI = 0;
         
         DAI = (ValorV - ValorD - Flete - Seguro) * 0.25; 
         
     return DAI;    
     }
}
