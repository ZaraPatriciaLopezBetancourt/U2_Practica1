package tablas;


import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zara
 */
public class Tabla {
    private static JTextField tab;
    private static JTextArea res;

    public Tabla() {
    }
    
     public static String Mult(int x, int y){
        String cad=""; int z;
        if(y!=0 && y%(x*11)==0){
           return "";
        }else{
            if(x==0){
                return "Todo valor multiplicado por 0 \n es igual a 0";
            }
           cad = "\n"+ Mult(x,x+y);
           return (x + " x " + y/x + " = " + y + cad);
        }
    }
     /*
      public static void Mostrar(){
        String cad="";
        int z = Integer.parseInt(tab.getText().trim());
        if(tab.getText().equals(""))  showMessageDialog(null,"Llene los datos necesarios");
        else res.setText(Mult(z,0));

    }*/  
}
