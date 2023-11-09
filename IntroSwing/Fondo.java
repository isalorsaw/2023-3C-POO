import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Graphics;
public class Fondo
{
    int x;
    int y;
    ImageIcon imagen;
    Image ima;
    public Fondo(int x, int y, String ruta)
    {
        this.x=x;
        this.y=y;
        this.imagen=new ImageIcon(getClass().getResource(ruta));
        this.ima=imagen.getImage();
    }
    public void dibujar(Graphics g)
    {
         g.drawImage(ima,x,y,null);   
    }
}