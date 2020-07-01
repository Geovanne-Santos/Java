
package saque;

import javax.swing.JOptionPane;


public class Saque {

    
    public static void main(String[] args) {
        double saque, saldoat,saldofin,saldolimite;
        saldoat = 1000;
        saldolimite = 2000;
        
        saque =Double.parseDouble( JOptionPane.showInputDialog("Quanto você quer sacar?"));
        
        saldofin = saldoat-saque;
        
        if (saldofin>=0){
        JOptionPane.showMessageDialog(null,"Seu saldo final é R$"+saldofin);}
        
        if((saldofin<0)&&(saldofin>=(-saldolimite))){
        JOptionPane.showMessageDialog(null,"Seu saldo é negativo com R$"+saldofin);
           
    }
        
       else
        JOptionPane.showMessageDialog(null,"voce nao tem limite suficiente seu limite é R$"+saldolimite);
    }
    
}