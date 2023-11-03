public class Figura
{
    int x,y;
    String nombre;
    
    Figura(int x, int y, String nombre)
    {
        this.x=x;
        this.y=y;
        this.nombre=nombre;
    }
    public String toString()
    {
        return "Figura: "+nombre+" X: "+x+" Y: "+y;
    }
    public double area()
    {
        return 0;
    }
    public void dibujar(java.awt.Graphics g)
    {
        
    }
}