
package salario;

import javax.swing.JOptionPane;


public class Salario {


    public static void main(String[] args) {
        
        double salario, resp;



salario=Double.parseDouble( JOptionPane.showInputDialog("digite o valor do seu salario que direi com imposto"));

if (salario < 1.903.98){
resp = 0
;}
if (( salario>=1.903,99) &&(salario<=2.826,65)) {
resp=salario * 0.075
        ;}
if ((salario>=2.826,66) && (salario<=3.751,05)){
resp= salario *0.15
        ;}
if (((salario>=3.751,06) && (salario<=4.664,68))){
resp=salario*0.225
        ;}
if  (salario>=4.664,68){
resp=salario*0.275
        ;}
 JOptionPane.showMessageDialog(null,"o desconto na sua folha de pagamento sera de:"+ resp+"")
    ;}
    
    }