import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;
public class Punto
{
    int x;
    int y;
    ImageIcon ima;
    Image imagen;
    public Punto()
    {
        x=y=0;
    }
    public void setRuta(String ruta)
    {
        this.ima=new ImageIcon(getClass().getResource(ruta));
        imagen=ima.getImage();
    }
    public Punto(int x, int y, String ruta)
    {
        this.x=x;
        this.y=y;
        this.ima=new ImageIcon(getClass().getResource(ruta));
        imagen=ima.getImage();
    }
    public void dibujar(Graphics g)
    {
        
    }
}