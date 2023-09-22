/*
 * Tarea Semana 1: Ejercicio 1: 
 * Programa que sume tres números introducidos por el usuario.
*/
//Importacion de Librerias
import javax.swing.JOptionPane;
public class PrimerEjercicio
{
    public static void main(String args[])
    {
        //Declaracion de Variables
        int n1=0;
        int n2=0;
        int n3=0;
        int suma=0;
        
        //Input=Entrada
        //I/O=Input-Output
        String entrada=JOptionPane.showInputDialog("Ingrese el Primer Entero");
        n1=Integer.parseInt(entrada);
        
        entrada=JOptionPane.showInputDialog("Ingrese el Segundo Entero");
        n2=Integer.parseInt(entrada);
        
        entrada=JOptionPane.showInputDialog("Ingrese el Tercer Entero");
        n3=Integer.parseInt(entrada);
        
        //Proceso
        suma=n1+n2+n3;
        
        //Salida
        JOptionPane.showMessageDialog(null,"La suma es: "+suma);
        //40+50+30=120
        //String result=n1+"+"+n2+"+"+n3+"="+suma;
        //JOptionPane.showMessageDialog(null,result);
    }
}