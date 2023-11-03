public class Rectangulo extends Figura
{
    int base,altura;
    Rectangulo(int x, int y,int base,int altura)
    {
        super(x,y,"Rectangulo");
        this.base=base;
        this.altura=altura;
    }
    public String toString()
    {
        return super.toString()+" Base: "+base+" Altura: "+altura;
    }
    public double area()
    {
        return base*altura;
    }
    public void dibujar(java.awt.Graphics g)
    {
        //g.drawRect(x,y,base,altura);
    }
}