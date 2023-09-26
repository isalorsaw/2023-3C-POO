import javax.swing.JOptionPane;
public class Ejercicio5
{
    /*
     * Comentario: Programa que pida primero nombre, 
    luego apellido y los muestre concatenados en pantalla.
     */
    public static void main(String args[])
    {
        //Declaracion de Variables
        String nombre="";
        String apellido="";
        
        //Entrada de Informacion
        nombre=JOptionPane.showInputDialog("Ingrese el Nombre");
        apellido=JOptionPane.showInputDialog("Ingrese el Apellido");
        
        //Proceso
        String nombrec=nombre+" "+apellido;
        
        //Salida
        JOptionPane.showMessageDialog(null,nombrec);
    }
}