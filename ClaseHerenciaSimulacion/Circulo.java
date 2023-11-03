public class Circulo extends Figura
{
    int radio;
    Circulo(int x, int y,int radio)
    {
        super(x,y,"Circulo");
        this.radio=radio;
    }
    public String toString()
    {
        return super.toString()+" Radio: "+radio;
    }
    public double area()
    {
        return 3.1416*(radio*radio);
    }
    public void dibujar(java.awt.Graphics g)
    {
        //g.drawOval(x,y,10);
    }
}