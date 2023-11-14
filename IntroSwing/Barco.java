import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Graphics;
public class Barco
{
    int x;
    int y;
    ImageIcon ima;
    Image imagen;
    //Constructores
    public Barco()
    {
        x=y=0;
        ima=null;
    }
    public Barco(int x, int y, String ruta)
    {
        this.x=x;
        this.y=y;
        this.ima=new ImageIcon(getClass().getResource(ruta));
        this.imagen=ima.getImage();
    }
    void cambiarImagen(String ruta)
    {
        this.ima=new ImageIcon(getClass().getResource(ruta));
        this.imagen=ima.getImage();
    }
    void dibujar(Graphics g)
    {
        g.drawImage(imagen,x,y,null);
    }
    void mover(char dir)
    {
        if(dir=='i')
        {
            x--;
            cambiarImagen("imagenes/barquito_i.png");
        }
        else if(dir=='d')
        {
            x++;
            cambiarImagen("imagenes/barquito_d.png");
        }
    }
    void voltear()
    {
        x+=50;
    }
    public String toString()
    {
        return "X:"+x+"Y:"+y;
    }
}