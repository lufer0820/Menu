/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquitecturadatos;

import javax.swing.JOptionPane;

/**
 *
 * @author luisa fer
 */
public class NewClassoper {
   public static void main(String[] args) {
       int numero1=5;
       int numero2=10;
       Operaciones operar = new Operaciones();
       JOptionPane.showMessageDialog(null,operar.sumar(numero1,numero2));  
   }
}