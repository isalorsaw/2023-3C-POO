import java.awt.Image;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
public class Roca extends Punto
{
    int ancho,alto;
    Rectangle rec;
    public Roca(int x, int y, String ruta)
    {
        super(x,y,ruta);
        ancho=ima.getIconWidth();
        alto=ima.getIconHeight();
        setRectangle();
    }
    public void setRectangle()
    {
        rec=new Rectangle(x,y,alto,ancho);
    }
    public void dibujar(Graphics g)
    {
        g.drawImage(imagen,x,y,null);
    }
}