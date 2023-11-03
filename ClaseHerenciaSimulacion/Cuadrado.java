public class Cuadrado extends Figura
{
    int lado;
    Cuadrado(int x, int y,int lado)
    {
        super(x,y,"Cuadrado");
        this.lado=lado;
    }
    public String toString()
    {
        return super.toString()+" Lado: "+lado;
    }
    public double area()
    {
        return lado*lado;
    }
    public void dibujar(java.awt.Graphics g)
    {
        g.drawRect(x,y,lado,lado);
    }
}