/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquitecturadatos;

/**
 *
 * @author luisa fer
 */
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Arreglo {
     public static void main(String[] args) {
        Scanner capturar = new Scanner(System.in);
        //EJERCICIO ARREGLO CON STRING
        String arreglo[] = new String [3];
       
        for(int ejeX=0; ejeX < arreglo.length; ejeX++){
        arreglo[ejeX]=JOptionPane.showInputDialog("ingrese el valor para la psicion:"+ejeX);
        }
        for(int ejeX=0; ejeX < arreglo.length; ejeX++){
         arreglo[ejeX]=JOptionPane.showInputDialog(null,"el valor ingresado:"+ejeX+"es"+arreglo);    
        
        
                
     }
}
     }
