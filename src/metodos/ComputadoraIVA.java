/*
Escriba un programa que imprima por pantalla cuánto le costará comprar una computadora a un determinado precio
si sabe que puede conseguir una rebaja del 15%. No olvidar que al precio del artículo se le debe de agregar el IVA. El
programa deberá permitir digitar el precio de la computadora y deberá de realizar los cálculos correspondientes.
*/
package metodos;
import java.util.Scanner;
import static metodos.ComputadoraIVA.resultado;

public class ComputadoraIVA {
     public static void main(String [] args) {
        Computadoras();
         
     }
     
     public static void Computadoras (){
     Scanner leer = new Scanner(System.in);
         double valorM;
         System.out.println("Digite el valor de la maquina: ");
         valorM = leer.nextDouble();
          
         
        double rebj = ComputadoraIVA.resultado(valorM);
        System.out.println("se le rebajara: " + rebj);
        
        
        
        double rebT = ComputadoraIVA.rebajaTotal(rebj, valorM);
         System.out.println("El valor de la computadora con rebaja es: " + rebT);
         
         double IVA = ComputadoraIVA.IvaT (valorM);
         System.out.println("El valor del Iva es: " + IVA);
         
         double RebIva = ComputadoraIVA.TOTAL(rebT, IVA);
         System.out.println("El valor total de la computador rebaja + IVA es: " +  RebIva);
     
     }
        
     public static double resultado (double valorM){
     double pagoCR = 0;
     
         pagoCR = valorM * 0.15;
         
         return pagoCR;
     }
     
     public static double IvaT (double valorM ){
     double iva = 0;
     
     iva = valorM * 0.13;
     return iva;
     }
     public static double rebajaTotal (double pagoCR,double valorM){
     double ValorT;
     double iva = 0;
     ValorT =  valorM - pagoCR;
     
    
     return ValorT;
     }
      public static double TOTAL (double ValorT , double iva){
       double ComT = 0;
          
       ComT = ValorT + iva;
        return ComT;
      }
}
