import javax.swing.JOptionPane;
public class Ejercicio4
{
    /*Comentario: Programa que pida un número y diga si este 
     * número es mayor o menor que 15.*/
    public static void main(String args[])
    {
        //Declaracion
        int numero=0;
        
        //Entrada
        String entrada=JOptionPane.showInputDialog("Ingrese un Numero");
        numero=Integer.parseInt(entrada);
        
        //Proceso
        if(numero>15)
        {
            JOptionPane.showMessageDialog(null,numero+" es mayor a 15");
        }
        else if(numero==15)
        {
            JOptionPane.showMessageDialog(null,numero+" es igual a 15");
        }
        else
        {
            JOptionPane.showMessageDialog(null,numero+" es menor a 15");
        }
    }
}