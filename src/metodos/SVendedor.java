/* Una agencia de venta de autos paga a su personal de ventas un salario de $800,00 más una comisión de $170,00 por auto 
vendido más un 5% del valor de venta. Diseñar un programa para calcular el salario de un vendedor en un determinado
mes, conociendo el nº de automóviles vendidos y el total del monto de ventas. Imprimir el nombre del vendedor y el salario
devengado por este */
package metodos;

import java.util.Scanner;


public class SVendedor {
    public static void main(String [] args) {
        VendedorS ();
    }
    
    public static void VendedorS () {
        
        Scanner leer = new Scanner (System.in);
        
        String nombre;
        double salario = 800,comision = 170, NAutos;
        double ValorV = 0.05, MVentas;
        
        
        System.out.println("Ingrese el nombre del vendedor: ");
        nombre = leer.next();
        
        System.out.println("Ingrese el numero de autos: ");
        NAutos = leer.nextInt();
        
        System.out.println("Ingrese el monto de ventas: $");
        MVentas = leer.nextDouble();
        
       double salarioD = SVendedor.Salariodesvengado (salario,NAutos,comision,MVentas,ValorV);
       
        System.out.println("El nombre del vendedor es: " + nombre);
        System.out.println("El salario final del trabajador es: " + salarioD);
    }
    
    public static double Salariodesvengado(double salario, double NAutos, double comision, double MVentas, double ValorV){
        double SalarioF = 0;
       
        SalarioF = salario + NAutos * comision + MVentas * ValorV;
        
        return SalarioF;
    }
}
