
package aumento;

import javax.swing.JOptionPane;


public class Aumento {

    
    public static void main(String[] args) {
double salariox,aumentoy = 0;

//Entrada

salariox=Double.parseDouble( JOptionPane.showInputDialog("Digite o seu salario"));

if(salariox<=1500){
aumentoy = salariox* 0.20
        ;}
if((salariox > 1500)&&(salariox <= 3000)) {
aumentoy=salariox * 0.15
        ;}
if(salariox > 3000){
aumentoy = salariox * 0.10;}

JOptionPane.showMessageDialog(null,"voce tera  R$"+aumentoy+"  a mais pelo seu  aumento.");
    }
    
}