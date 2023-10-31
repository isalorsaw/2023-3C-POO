import javax.swing.JFrame;
import java.awt.Color;
public class Pral extends JFrame
{
    Escenario e;
    public Pral()
    {
        super("Titulo");//Mostrar un titulo en una ventana parte superior izq
        
        e=new Escenario();
        
        add(e);
        
        setSize(800,500);//Tamanio de la ventana. PX
        setLocationRelativeTo(null);//Centrar la venta en la pantalla
        setResizable(false);//Evitar que se maximice
        setBackground(Color.yellow);
        setVisible(true);//Mostrar la ventana
    }
    public static void main(String args[])
    {
        new Pral();
    }
}