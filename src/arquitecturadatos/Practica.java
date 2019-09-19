
package arquitecturadatos;
/**
 *
 * @author luisa fer
 */

import javax.swing.JOptionPane;
public class Practica {
    
   
   public static void main(String[] args) {
       //variable local
       int opcion=0;
       String continuar="No";
       int numerouno;
       int numerodos;
       
       numerouno = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor para la variable numero 1:"));
       numerodos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor para la variable numero 2:"));
       
       int resultado=0;
       try{
       opcion=Integer.parseInt(JOptionPane.showInputDialog("ingrese un valor de las siguientes opciones"
               +"\n 1 mostrar calculadora"
               +"\n 2 mostrar arreglos"
               +"\n 3 mostrar matrices"
               +"\n 4 salir"));
       }catch(Exception ex){
          JOptionPane.showMessageDialog(null,"Debe ingresar solo valores ");
       }
       switch(opcion){
               //menu principal
               case 1:
               JOptionPane.showMessageDialog(null,"mostrar calculadora");
                try{
               opcion=Integer.parseInt(JOptionPane.showInputDialog("escoja la opcion a realizar"
               +"\n 1 operaciones basicas"
               +"\n 2 ejercicios de arreglo"
               +"\n 3 ejercicio de matrices"
               +"\n 4 salir"));
               }catch(Exception ex){
               JOptionPane.showMessageDialog(null,"Debe ingresar solo valores ");
               }
               //menu de operaciones basicas
               switch(opcion){
                   case 1:
                    JOptionPane.showMessageDialog(null,"realizar operacione bsicas");
                    opcion=Integer.parseInt(JOptionPane.showInputDialog("escoja la operacion a realizar"
                    +"\n 1 realizar suma"
                    +"\n 2 realizar resta"
                    +"\n 3 realizar multiplicacion"
                    +"\n 4 realizar division"
                    +"\n 5 volver")); 
                    //ejecuta la operacion
                   switch(opcion){
                       case 1:
                       opcion=1;
                       resultado=numerouno+numerodos;
                       JOptionPane.showMessageDialog(null,"la suma es:"+resultado);
                       break; 
                       case 2:
                       opcion=2;
                       resultado=numerouno-numerodos;
                       JOptionPane.showMessageDialog(null,"la resta es:"+resultado);
                       break;
                       case 3:
                       opcion=3;
                       resultado=numerouno*numerodos;
                       JOptionPane.showMessageDialog(null,"la multiplicacion es:"+resultado);
                       break;
                       case 4:
                       opcion=4;
                       resultado=numerouno/numerodos;
                       JOptionPane.showMessageDialog(null,"la division es:"+resultado);
                       break;
                       default:
                       JOptionPane.showMessageDialog(null,"ingreso una opcion no valida");    
                        
                   } 
                 }
                       
               case 2:
               JOptionPane.showMessageDialog(null,"mostrar arreglos");
               opcion=2;  
               JOptionPane.showMessageDialog(null,"realizar ejercicios de arreglo");
               
               opcion=Integer.parseInt(JOptionPane.showInputDialog("escoja el ejercio de arreglo"
                    + "\n 1. arreglo notas."
                    + "\n 2. arreglo dos"
                    + "\n finalizar"));
                switch(opcion){
                       case 1:
                       opcion=1;
                    JOptionPane.showMessageDialog(null,"ha escogido arreglo notas"); 
                    int nota[]=new int[3];
                    int cantidadaprobados=0,cantidaddesaprobados=0,notamenor,notamayor;
                    for(int i=0;i<nota.length;i++){
                    nota[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresar nota :"+(i+1)));
                    }
                    notamayor=nota[0];
                    notamenor=nota[0];
                    for(int i=0;i<nota.length;i++){
                        if(nota[i]>10.4){
                       cantidadaprobados = cantidadaprobados+1;
                        }else{
                            cantidaddesaprobados=cantidaddesaprobados+1;
                        }
                        if(notamayor<nota[i]){
                            notamayor=nota[i];
                        }else if(notamenor>nota[i]){
                            notamenor=nota[i];
                        }
                    }
                     JOptionPane.showMessageDialog(null,"nota mayor"+notamayor+"\nnota menor:"+notamenor+"\ncantidad aprobados:"+cantidadaprobados+"\ncantidad desaprobados:"+cantidaddesaprobados);                    
                       break;
                       
                       case 2:
                       opcion=2;
                       JOptionPane.showMessageDialog(null,"ha escogido arreglo dos");
                       int arreglo[]=new int[5];
                       int numero1=0;
                       int numero2=0;
                       int numero3=0;
                       int numero4=0;
                       
                       for(int i=0 ; i<arreglo.length -1; i++){
                       for(int j=0 ; j<arreglo.length -1; j++){
                       if(arreglo[j]>arreglo[j+1]){
                       int aux = arreglo[j];
                       arreglo[j]=arreglo[j+1];
                       arreglo[j+1]=aux; 
                     }
                  }
                   }


for(int z=0 ; z<arreglo.length ; z++){
System.out.println(arreglo[z]);
}

}

}
                   
                       
                       break;
                       default:
                      JOptionPane.showMessageDialog(null,"ingreso una opcion no valida");     
                   
                }  
               break;
               case 3:
               JOptionPane.showMessageDialog(null,"mostrar operacion matrices");
               break; 
               case 4:
               JOptionPane.showMessageDialog(null, "seleccionar salir");
               break;
               default:
               JOptionPane.showMessageDialog(null,"ingreso una opcion no valida");
               break;
              
                       
   } 
  }
 }


  
