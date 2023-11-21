import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;
public class Fondo extends Punto
{
    int ancho,alto;
    public Fondo(int x, int y, String ruta)
    {
        super(x,y,ruta);
        ancho=ima.getIconWidth();
        alto=ima.getIconHeight();
    }
    public void dibujar(Graphics g)
    {
        g.drawImage(imagen,x,y,null);
    }
}