
package voleibol;

import javax.swing.JOptionPane;


public class Voleibol {

public static void main(String[] args) {
       boolean  competirum,competirdois,competirtres;
       double altura,idade;


 JOptionPane.showMessageDialog(null,"para competir é necessario de ter pelo menos 1.75 de altura e 18 anos.");
altura=Double.parseDouble( JOptionPane.showInputDialog("Digite sua altura em cm"));

idade=Double.parseDouble( JOptionPane.showInputDialog("Digite sua idade"));

if((idade >= 18) && (altura>= 175)){
JOptionPane.showMessageDialog(null,"você pode competir competir")
        ;}
else{
JOptionPane.showMessageDialog(null,"você não pode  competir?");}

    }
    
}
