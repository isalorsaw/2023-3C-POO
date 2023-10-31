import javax.swing.ImageIcon;
import java.awt.Graphics;
public class Punto
{
    int x;
    int y;
    ImageIcon imagen;
    
    Punto()
    {
        x=0;
        y=0;
        imagen=null;
    }
    Punto(int x, int y, String ruta)
    {
        this.x=x;
        this.y=y;
        //this.imagen=
    }
    Punto(int x, int y)
    {
        this.x=x;
        this.y=y;
        //this.imagen=
    }
    void mover()
    {
        
    }
    void dibujar(Graphics g)
    {
         //g.drawImage();   
    }
}