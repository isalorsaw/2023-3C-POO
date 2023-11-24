import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import java.awt.Rectangle;
public class Carro extends Punto
{
    int ancho,alto;
    Rectangle rec;
    boolean visible;
    boolean frenar;
    public Carro(int x, int y, String ruta)
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
        if(frenar==false)//Si no esta frenado que se mueva
        {
            if(d=='d')x+=5;
            else if(d=='u')y--;
            setRectangle();
        }
    }
    public boolean detectarChoque(Rectangle otro)
    {
        return rec.intersects(otro);
    }
}