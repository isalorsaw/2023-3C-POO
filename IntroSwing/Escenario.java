import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
public class Escenario extends JPanel implements KeyListener
{
    //Incorporar clases
    Punto p;
    Barco b;
    public Escenario()
    {
        //Generar un aleatorio.
        int xx=FM.generaAleatorio(50,750);
        System.out.println(xx);
        
        addKeyListener(this);//Agregar la escucha de las teclas
        setFocusable(true);//Importante para los eventos de las teclas
        
        p=new Punto(400,250);
        b=new Barco(xx,250,"imagenes/barquito.png");
        setSize(800,500); 
        
        
    }
    public void keyReleased(KeyEvent e)//Suelto la tecla
    {
        
    }
    public void keyPressed(KeyEvent e)//Al presionar una tecla
    {
        int codigo=e.getKeyCode();
        //System.out.println("Hola "+codigo);
        if(codigo==37)//Izquierda
        {
            System.out.println("Barco a la Izq "+codigo);
            b.mover('i');
            repaint();
        }
    }
    public void keyTyped(KeyEvent evt)//Al presionar una tecla
    {
        
    }
    public void paint(Graphics g)
    {
        //g.drawString(string,x,y);
        //g.drawString("Hola",400,250);
        //g.drawLine(x1,y1,x2,y2);
        g.drawLine(50,300,750,300);
        b.dibujar(g);
        p.dibujar(g);
        g.drawString(b.toString(),b.x,b.y+70);
    }
}