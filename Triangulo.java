package triangulo;

import javax.swing.JOptionPane;


public class Triangulo{


    public static void main(String[] args) {
    double a,b,c;
 JOptionPane.showMessageDialog(null, "este programa informa o tipo do triângulo");

 a= Double.parseDouble(JOptionPane.showInputDialog("qual o valor do primeiro lado do triângulo?"));

 b= Double.parseDouble(JOptionPane.showInputDialog("qual o valor do segundo lado do triângulo "));

 c= Double.parseDouble(JOptionPane.showInputDialog("qual o valor do terceiro lado do triângulo"));
 
  if(((a<(b+c)) && (a>(Math.abs(b-c))) && (b<(a+c)) && (b>(Math.abs(a-c))) && (c<(a+b)) && (c>(Math.abs(a-b))))) {
    
    
  if ((a==b) && (b==c) && (a==c)){
  
  JOptionPane.showMessageDialog(null, "estes valores formam um tirângulo equilatero");
   }  
  
  if ((a!=b) && (b!=c) && (a!=c)){
  
      JOptionPane.showMessageDialog(null,"estes valores formam um triângulo escaleno");
  }
  
  if (((a==b) && (b!=c)) || ((b==c) && (c!=a)) || ((a==c) && (c!=b))){
  
  JOptionPane.showMessageDialog(null, "estes valores formam um triângulo escaleno");
  
  }
  
  
  
  
  
  }else{  
    
            
            JOptionPane.showMessageDialog(null, "isto não é um triângulo");
            
            }
           
    }
   
}