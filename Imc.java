
package imc;

import javax.swing.JOptionPane;


public class Imc {


    public static void main(String[] args) {
double peso,altura,imc,abaixo;





altura=Double.parseDouble( JOptionPane.showInputDialog("Digite sua altura"));
peso=Double.parseDouble( JOptionPane.showInputDialog("Digite o seu peso"));

imc=peso/(altura*altura);

JOptionPane.showMessageDialog(null ,"Seu imc é de:"+imc+" então:");
        
if(imc <= 18){
JOptionPane.showMessageDialog(null,"abaixo do peso:"+imc);
        }
if((18 < imc)&&(imc <= 24)){
JOptionPane.showMessageDialog(null,"peso normal:"+imc);}

if ((25 < imc) && (imc <= 29)){
JOptionPane.showMessageDialog(null,"sobrepeso:"+imc);}

if((30 < imc) && (imc <= 34)) {
JOptionPane.showMessageDialog(null,"obgrau um:"+imc);}

if((35 < imc) && (imc <= 39)) {
JOptionPane.showMessageDialog(null,"obgrau dois:"+imc);}

if (40 <= imc){
JOptionPane.showMessageDialog(null,"obgrau tres:"+imc);}

    }
    
}
