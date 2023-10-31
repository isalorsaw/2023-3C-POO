import javax.swing.JPanel;
import java.awt.Graphics;
public class Escenario extends JPanel
{
    //Incorporar clases
    Punto p;
    public Escenario()
    {
        p=new Punto(400,250);
        setSize(800,500); 
    }
    public void paint(Graphics g)
    {
        //g.drawString(string,x,y);
        g.drawString("Hola",400,250);
        p.dibujar(g);
    }
}