import javax.swing.JOptionPane;
public class Ejercicio9
{
    public static void main(String args[])
    {
        /*
         * Ingresar un numero y mostrar si es = a cero si es positivo o negativo
        */
       int num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Entero"));
       
       if(num==0)
       {
           JOptionPane.showMessageDialog(null,"Numero es igual a cero");
       }
       else if(num>0)
       {
           JOptionPane.showMessageDialog(null,"Numero es POSITIVO");
       }
       else
       {
           JOptionPane.showMessageDialog(null,"Numero es NEGATIVO");
       }
    }
}