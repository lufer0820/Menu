
package arquitecturadatos;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
       int opcion=0;
       int numerouno;
       int numerodos;
       int resultado;
       
       numerouno = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor para la variable numero 1:"));
       numerodos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor para la variable numero 2:"));
       do{
       try{
       opcion=Integer.parseInt(JOptionPane.showInputDialog("ingrese un valor de las siguientes opciones"
               +"\n 1 mostrar calculadora"
               +"\n 2 mostrar arreglo"
               +"\n 3 mostrar matriz"
               +"\n 4 mostrar set y get"
               +"\n 5 mostrar ordenamiento "
               +"\n 6 salir"));
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
               +"\n 4 ejercicio de set y get"
               +"\n 5 ejercicio de ordenamiento"        
               +"\n 6 salir"));
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
                        opcion=5;   
                       JOptionPane.showMessageDialog(null,"ingreso una opcion no valida");    
                       break; 
                   } 
                 }
                       
               case 2:
               opcion=2;  
               opcion=Integer.parseInt(JOptionPane.showInputDialog("escoja el ejercio de arreglo"
                    + "\n 1. arreglo notas."
                    + "\n 2. arreglo numeros."  
                    + "\n 3.finalizar"));
                switch(opcion){
                       case 1:
                       opcion=1;
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
                       int mayor,menor,suma=0;        
                        int [] nums={3,4,8,2};//asignamos directamente los valores del vector        
                        suma=0;        
                        menor=nums[0];        
                        mayor=nums[0];    
                        for(int i=0;i<nums.length;i++){
                        if (nums[i]>mayor){           
                        mayor=nums[i];          
                        }

                        if (nums[i]<menor){         
                        menor=nums[i];          
                        }
                        suma+=nums[i];     
                        }
                        JOptionPane.showMessageDialog(null,"el mayor es:"+mayor);
                        JOptionPane.showMessageDialog(null,"el menor es:"+menor);
                        JOptionPane.showMessageDialog(null,"la suma es"+suma);
  
                       break;
                       default:
                      JOptionPane.showMessageDialog(null,"ingreso una opcion no valida");     
                   
                }  
               break;
               case 3:
               opcion=3;    
               JOptionPane.showMessageDialog(null,"mostrar operacion matrices");
               opcion=Integer.parseInt(JOptionPane.showInputDialog("escoja el ejercio de matriz"
                    + "\n 1. matriz."  
                    + "\n 2.finalizar"));
               
               switch(opcion){
                       case 1:
                       opcion=1;
                String acu =  " " ;
		int i = 0 , j = 0 ;
		int matriz [] [];
		matriz =new int[5][5];
		for(i=0;i<5;i++){
		for(j=0;j<5;j++){
		matriz[i][j]=j+i;
		if(j==4){
		acu=""+acu+""+ matriz[i][j]+"\n" ;
		} else{
	        acu = " " + acu + "      " + matriz [i] [j];
		}		
		}
		} JOptionPane.showMessageDialog(null,"Matriz 5x5 "+"\n"+ acu); 
                break;
                case 2:
                opcion=2;
                JOptionPane.showMessageDialog(null,"salir");
                default:
                JOptionPane.showMessageDialog(null,"ingreso una opcion no valida");    
               }            
               break; 
               case 4:
               opcion=4;    
               JOptionPane.showMessageDialog(null, "mostrar operación de set y get");
               
               break;
               case 5:
               opcion=5;    
               JOptionPane.showMessageDialog(null, "mostrar operación de ordenamiento");
               Scanner tecla = new Scanner(System.in);
               Scanner key = new Scanner(System.in);
               int tam;
               JOptionPane.showMessageDialog(null,"ingresar tamaño:");
               tam = tecla.nextInt();
               String[] A= new String[tam]; 
               for(int i=0; i<A.length; i++){
               JOptionPane.showMessageDialog(null,"ingrese texto:"+i);
            A[i] = key.nextLine();}
       
        // Imprimimos el array A desordenado. 
         JOptionPane.showMessageDialog(null,"array A desordenado:");      
        for(int i=0; i<A.length; i++){
            JOptionPane.showMessageDialog(null," A[" + i + "] = " + A[i] ); }
       
        // Inicio del metodo de ordenamiento de la Burbuja
        String aux; 
        for(int i=1; i<=A.length; i++) {  
            for(int j=0; j<A.length-i; j++) { 
                if( A[j].compareTo( A[j+1] ) > 0 ) { 
                    aux   = A[j]; 
                    A[j]  = A[j+1]; 
                    A[j+1]= aux; 
                }    
            } 
        }
        // Fin del metodo de ordenamiento de la Burbuja
        // Imprimimos el array A ordenado.
        JOptionPane.showMessageDialog(null,"\n array A ordenado:"); 
        for(int i=0; i<A.length; i++){
            JOptionPane.showMessageDialog(null," A[" + i + "] = " + A[i] );
        }                         
               break;
               default:   
               JOptionPane.showMessageDialog(null,"ingreso una opcion no valida");
               break;
              
                       
   }   
        
     }while(opcion>0 && opcion <=5);   
    }
    
}
