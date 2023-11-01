import javax.swing.JPanel;
import java.awt.Graphics;
public class Escenario extends JPanel
{
    //Incorporar clases
    Punto p;
    Barco b;
    public Escenario()
    {
        p=new Punto(400,250);
        b=new Barco(50,250,"imagenes/barquito.png");
        setSize(800,500); 
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