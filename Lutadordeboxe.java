
package lutadordeboxe;

import javax.swing.JOptionPane;


public class Lutadordeboxe {

 public static void main(String[] args) {
double Pesado,Cruzador,MeioPesado,SuperMedio,Medio,SuperMeioMedio,MeioMedio,SuperLeve,Leve,SuperPena,Pena,SuperGalo,Galo,SuperMosca,Mosca,MoscaLigeiro,Palha,PalhaLigeiro;
double peso;




peso=Double.parseDouble( JOptionPane.showInputDialog("Digite seu peso:"));


if (46>=peso) {
  JOptionPane.showMessageDialog(null,"palha ligeiro:")
         ;}
 if((47<=peso)&&(peso>46))   {
 JOptionPane.showMessageDialog(null,"palha:")
         ;}
if((47<peso)&&(peso<=48))   {
 JOptionPane.showMessageDialog(null,"mosca ligeiro:")
         ;}
  if ((48<peso)&&(50<=peso))   {
 JOptionPane.showMessageDialog(null,"super mosca:")
  ;}
if((peso<50)&&(51<=peso))     {
  JOptionPane.showMessageDialog(null," mosca:")
;}
 if((51<peso)&&(53<=peso))         {
  JOptionPane.showMessageDialog(null,"galo:")
;}
if((53<peso)&&(55<=peso)){
  JOptionPane.showMessageDialog(null,"supero galo:")
;}
 if        ((55<peso)&&(57<=peso)) {
 JOptionPane.showMessageDialog(null,"pena:")
 ;}
  if((57<peso)&&(58<=peso))      {
 JOptionPane.showMessageDialog(null,"super pena:")
         ;}
if ((58<peso)&&(61<=peso))    {

  JOptionPane.showMessageDialog(null,"leve:")
  ;}
 if((61<peso)&&(63<=peso))   {
 JOptionPane.showMessageDialog(null,"super leve:")
    ;}
 if((63<peso)&&(66<=peso)){
  JOptionPane.showMessageDialog(null,"meio-médio:")
  ;}
 if((66<peso)&&(69<=peso))  {
  JOptionPane.showMessageDialog(null,"super meio-medio:")
;}
 if ((69<peso)&&(73<=peso))    {
  JOptionPane.showMessageDialog(null,"medio:")
         ;}
  if((73<peso)&&(76<=peso))  {
  JOptionPane.showMessageDialog(null,"super medio:")
    ;}
 if((76<peso)&&(79<=peso))   {
  JOptionPane.showMessageDialog(null,"meio pesado:")
;}
if ((79<peso)&&(peso<=90))    {
  JOptionPane.showMessageDialog(null,"cruzado:")
 ;}
if(90<peso){
 JOptionPane.showMessageDialog(null,"pesado:")
         ;}


    }
    
}