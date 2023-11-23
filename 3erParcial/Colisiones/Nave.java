import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import java.awt.Rectangle;
public class Nave extends Punto
{
    int ancho,alto;
    Rectangle rec;
    boolean visible;
    boolean frenar;
    public Nave(int x, int y, String ruta)
    {
        super(x,y,ruta);
        ancho=ima.getIconWidth();
        alto=ima.getIconHeight();
        visible=true;
        frenar=false;
    }
    public void cambiarImagen(String ruta)
    {
        super.setRuta(ruta);
    }
    public void setRectangle()
    {
        rec=new Rectangle(x,y,ancho,alto);
    }
    public void dibujar(Graphics g)
    {
        if(visible)g.drawImage(imagen,x,y,null);
    }
    public void mover(char d)
    {
        if(d=='d')x+=5;
        else if(d=='i')x-=5;
            setRectangle();
    }
    public boolean detectarChoque(Rectangle otro)
    {
        return rec.intersects(otro);
    }
}