
package arquitecturadatos;
import ListasSimples.EjemploListas;
import java.util.List;
import javax.swing.JOptionPane;

public class Menu {
    public static void main(String[] args) {
        Operaciones operar = new Operaciones();
        
        
       int opcion=0;
     int numero1=3;
     int numero2=11;
    double resultado;
       
       
       do{
       try{
           //menu principal
       opcion=Integer.parseInt(JOptionPane.showInputDialog("ingrese un valor de las siguientes opciones"
               +"\n 1 mostrar calculadora"
               +"\n 2 mostrar arreglo"
               +"\n 3 mostrar matriz"
               +"\n 4 mostrar ordenamiento "
               +"\n 5 mostrar listas "
               +"\n 6 mostrar pilas "
               +"\n 7 salir"));
       }catch(Exception ex){
          JOptionPane.showMessageDialog(null,"Debe ingresar solo valores ");
       }
       switch(opcion){
               //submenu 
               case 1:
               JOptionPane.showMessageDialog(null,"mostrar calculadora");
                try{
               opcion=Integer.parseInt(JOptionPane.showInputDialog("escoja la opcion a realizar"
               +"\n 1 operaciones basicas"
               +"\n 2 ejercicios de arreglo"
               +"\n 3 ejercicio de matrices"
               +"\n 4 ejercicio de ordenamiento"
               +"\n 5 ejercicio listas "
               +"\n 6 ejercicio pilas "        
               +"\n 7 salir"));
               }catch(Exception ex){
               JOptionPane.showMessageDialog(null,"Debe ingresar solo valores ");
               }
               //menu de operaciones basicas
               //aplicando set y get  
               switch(opcion){
                   case 1:
                    JOptionPane.showMessageDialog(null,"realizar operacione basicas");
                    opcion=Integer.parseInt(JOptionPane.showInputDialog("escoja la operacion a realizar"
                    +"\n 1 realizar suma"
                    +"\n 2 realizar resta"
                    +"\n 3 realizar multiplicacion"
                    +"\n 4 realizar division"
                    +"\n 5 volver")); 
                    //ejecuta la operacion con los get y set
                   switch(opcion){
                       case 1:
                       opcion=1;
                       JOptionPane.showMessageDialog(null,operar.sumar(numero1,numero2));
                       break; 
                       case 2:
                       opcion=2;
                       JOptionPane.showMessageDialog(null,operar.resta(numero1,numero2));
                       break;
                       case 3:
                       opcion=3;
                        JOptionPane.showMessageDialog(null,operar.multiplicar(numero1,numero2));
                       break;
                       case 4:
                       opcion=4;
                       JOptionPane.showMessageDialog(null,operar.dividir(numero1,numero2));
                       break;
                       default:
                        opcion=5;   
                       JOptionPane.showMessageDialog(null,"ingreso una opcion no valida");    
                       break; 
                   } 
                 }
                       
               case 2:
                   //menu de arreglo
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
                   //menu de matriz
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
               case 4:
                   //EJERCICIOS ORDENAMIENTO
               opcion=4; 
               JOptionPane.showMessageDialog(null,"Bienvenido a los ejercicios de ordenamiento");
               opcion=Integer.parseInt(JOptionPane.showInputDialog("escoja el ordenamiento"
                    + "\n 1. Ordenamiento Burbuja."
                    + "\n 2. Ordenamiento Shell."  
                    + "\n 3.finalizar"));
                  
            switch(opcion){
                case 1:
                    opcion=1;
                    Ordenacionburbuja();
                    break;
                case 2:
                    opcion=2;
                    Ordenacionshell();
                    break;   
                default:
                    JOptionPane.showMessageDialog(null, "Opción No Valida");
                    break;
            }

               case 5:
               opcion=5;
               JOptionPane.showMessageDialog(null,"escogio listas");  
               opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opción valida: \n"
                    + "\n 1. listas Simples.\n"
                    + "\n 2. listas Dobles\n" 
                    + "\n 3.finalizar"));
                 switch(opcion){
                case 1:
                    opcion=1;
                    EjemploListas objEjemploListas = new EjemploListas();
                    objEjemploListas.menu();
                    break;
                    
                case 2:
                    opcion=2;
                      
                    break;   
                default:
                    JOptionPane.showMessageDialog(null, "Opción No Valida");
                    break;
            
                 }
               
               case 6:
               JOptionPane.showMessageDialog(null,"escogio pilas"); 
               
               break;    
               default:   
               JOptionPane.showMessageDialog(null,"ingreso una opcion no valida");
               break;
              }
                       
       
        
     }while(opcion>0 && opcion <=5);   

   
    }
//Inicio metodos de ordenamiento
    private static void Ordenacionburbuja() {
        System.out.print(" !! Bienvenidos al Metodo Ordenacion Burbuja: !!\n\n");
            int lista[] = {3,2,1};
                    System.out.print("Lista desordenada: ");
                    imprimirLista(lista);
                    ordenar(lista);

                    System.out.print("Lista ordenada:    ");
                    imprimirLista(lista);
                    System.out.print("\n");
                    
         }
    public static void ordenar(int [] A){
        int i, j, aux;
        for(i= 0; i < A.length - 1; i++){
            for(j= 0; j < A.length - i - 1; j++){
                if(A[j + 1] < A[j]){
                   aux= A[j + 1];
                   A[j+1]= A[j];
                   A[j]= aux;
                }
            }
        }
    }
    public static void imprimirLista(int[] arreglo){
        for(int i = 0; i < arreglo.length;i++){
            System.out.print(arreglo[i]+",");
        }
        System.out.println();
   }

    private static void Ordenacionshell() {
     System.out.print(" !!  Bienvenidos al Metodo Ordenacion Shell: !!\n\n");
        int lista[] = {5,4,3,2,1};
        System.out.print("Lista desordenada: ");
        imprimeLista(lista);
        ordenShell(lista);

        System.out.print("Lista ordenada:    ");
        imprimeLista(lista);
        System.out.print("\n");
    }   
    public static void ordenShell(int a[])
    {
        int intervalo, i, j, k;
        int n= a.length;
        intervalo = n / 2;
        while (intervalo > 0){
            for (i = intervalo; i < n; i++){
                j = i - intervalo;
                while (j >= 0){
                    k = j + intervalo;
                    if (a[j] <= a[k]){
                        j = -1; // par de elementos ordenado
                    }else{
                        intercambiar(a, j, j+1);
                        j -= intervalo;
                    }
                }
            }
            intervalo = intervalo / 2;
        }
    }
  
    public static void intercambiar(int []a, int i, int j)
    {
        int aux = a[i];
        a[i] = a[j];
        a[j]= aux ;
    }
    
    public static void imprimeLista(int[] arreglo){
        for(int i = 0; i < arreglo.length;i++){
            System.out.print(arreglo[i]+",");
        }
        System.out.println();
    }
    

    }//cierre de llave menu
    

