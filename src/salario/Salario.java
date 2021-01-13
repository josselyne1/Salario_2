/*
 *Una compañía ha tenido un excelente año y desea premiar a sus empleados 
con un aumento de salarios. Los sueldos deben ajustarse a la siguiente forma:

Sueldo actual	Aumento
Hasta $9,000	20 %
$9,001 - $13,000	17 %
$13,001 - $ 18,000	12 %
Sobre $18,000	6 %

La compañía tiene 50 empleados. Diseñe un algoritmo en diagrama de flujo que 
lea el nombre de cada empleado y su sueldo actual, y que imprima el nombre, 
el sueldo actual y el sueldo aumentado. Al final de la lista debe proporcionar
también, el monto total de la nómina actual y el monto total de la nueva nómina 
que incluye los aumentos mencionados.

 */
package salario;

import java.util.Scanner;

/**
 *
 * josselyne ester chilito galindez,  codigo: 20201187434
 */
public class Salario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer= new Scanner (System.in);
        
        int salario, aumento=0,nominaI=0,nominaF=0;
        String [][] info= new String [50][3];
        
        for(int c=0;c<50;c++){
        
            System.out.println("DIGITE SU NOMBRE");
            info[c][0]= leer.next();
            System.out.println("DIGITE SU SUELDO");
            salario= leer.nextInt();
            info[c][1]=String.valueOf(salario); //convertir salario(int) en string que queda guardado en la matriz info c 1
            
            if (salario<=9000){
           aumento=(((salario*20)/100)+salario);
           info[c][2]=String.valueOf(aumento);
            
            }else{
                if(salario>9000 && salario<=13000){
           aumento=(((salario*17)/100)+salario);
           info[c][2]=String.valueOf(aumento);
            
            }else{
                if(salario>=13001 && salario<=18000){
           aumento=(((salario*12)/100)+salario);
           info[c][2]=String.valueOf(aumento);
            
            }else{
                if( salario>18000){
           aumento=(((salario*6)/100)+salario);
           info[c][2]=String.valueOf(aumento);
            
            }}}}
        nominaI=nominaI+salario;
        nominaF=nominaF+aumento;
        
        }
        
      for (int j=0;j<50;j++){
          System.out.println("---------------------------");
          System.out.println(" SU NOMBRE ES: "+info[j][0]);
          System.out.println(" SU SUELDO ACTUAL "+info[j][1]);
          System.out.println(" SU SUELDO CON AUMENTO ES: "+info[j][2]);
    
    } 
        System.out.println(" NOMINA ACTUAL: "+nominaI);
        System.out.println(" NOMINA CON AUMENTO "+nominaF);
    }
    
}
