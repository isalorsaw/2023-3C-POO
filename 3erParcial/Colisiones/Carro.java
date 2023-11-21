import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import java.awt.Rectangle;
public class Carro extends Punto
{
    int ancho,alto;
    Rectangle rec;
    public Carro(int x, int y, String ruta)
    {
        super(x,y,ruta);
        ancho=ima.getIconWidth();
        alto=ima.getIconHeight();
    }
    public void setRectangle()
    {
        rec=new Rectangle(x,y,ancho,alto);
    }
    public void dibujar(Graphics g)
    {
        g.drawImage(imagen,x,y,null);
    }
    public void mover(char d)
    {
        if(d=='d')x+=5;
        setRectangle();
    }
    public boolean detectarChoque(Rectangle otro)
    {
        return rec.intersects(otro);
    }
}