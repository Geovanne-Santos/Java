
package parouimpar;

import javax.swing.JOptionPane;


public class ParouImpar {

    public static void main(String[] args) {
        
    double num;
    
    JOptionPane.showMessageDialog(null,"Esse programa informa se o nÃºmero Ã© par ou impar");

    num = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o  nÃºmero que vocÃª deseja saber se Ã© par ou impar"));
   
  if (num % 2==0){
    
    JOptionPane.showMessageDialog(null,"esse número é par");
    
    }else{
  
    JOptionPane.showMessageDialog(null,"esse número é impar");
       
  
  }
    
    }
    
    
}
