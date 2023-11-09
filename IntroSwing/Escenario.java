import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
public class Escenario extends JPanel implements KeyListener
{
    //Incorporar clases
    Punto p;
    Barco b;
    Fondo f;
    public Escenario()
    {
        //Generar un aleatorio.
        int xx=FM.generaAleatorio(50,750);
        System.out.println(xx);
        
        addKeyListener(this);//Agregar la escucha de las teclas
        setFocusable(true);//Importante para los eventos de las teclas
        
        p=new Punto(400,250);
        b=new Barco(xx,430,"imagenes/barquito_d.png");
        f=new Fondo(0,0,"imagenes/fondo2.png");
        setSize(1000,570); 
    }
    public void keyReleased(KeyEvent e)//Suelto la tecla
    {
        
    }
    public void keyPressed(KeyEvent e)//Al presionar una tecla
    {
        int codigo=e.getKeyCode();
        System.out.println("Hola "+codigo);
        if(codigo==37)//Izquierda
        {
            //System.out.println("Barco a la Izq "+codigo);
            b.mover('i');
            repaint();
        }
        else if(codigo==39)
        {
            b.mover('d');
            repaint();
        }
    }
    public void keyTyped(KeyEvent evt)//Al presionar una tecla
    {
        
    }
    public void paint(Graphics g)
    {
        super.paint(g);//DobbleBuffer
        g.drawLine(50,300,750,300);
        f.dibujar(g);
        b.dibujar(g);
        p.dibujar(g);
        //g.drawString(b.toString(),b.x,b.y+70);
    }
}