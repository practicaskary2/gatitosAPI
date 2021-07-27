/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gatitos_app;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Karina
 */
public class Inicio {
    
    public static void main(String[] args) throws IOException {
        
        int opcion_menu = -1;
        String[] botones = {"1. Ver gatos", "2. Salir"};
        
        do{
           //Menú Principal 
            String opcion = (String) JOptionPane.showInputDialog(null,"Gatitos Java", "Menu Principal", JOptionPane.INFORMATION_MESSAGE,
                    null,botones,botones[0]);
            
            //Validar que opción selecciona el usuario
            for(int i=0;i<botones.length;i++){
                if(opcion.equals(botones[i])){
                    opcion_menu = 1;
                }
            }
            
            switch(opcion_menu){
                case 0:
                    GatoService.verGatitos();
                    break;
                default:
                    break;
            }
            
        }while(opcion_menu != 1);
        
    }
    
}
