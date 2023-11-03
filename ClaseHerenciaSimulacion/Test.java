public class Test
{
    static Figura f[]=new Figura[3];
    public static void main(String args[])
    {
        f[0]=new Circulo(100,200,10);
        f[1]=new Cuadrado(5,5,10);
        f[2]=new Rectangulo(100,200,60,70);
        
        String cadena="Informacion\n";
        for(int i=0;i<f.length;i++)
        {
            cadena+=f[i].toString()+" Area: "+f[i].area()+"\n";
        }
        javax.swing.JOptionPane.showMessageDialog(null,cadena);
    }
    public void paint(java.awt.Graphics g)
    {
        for(int i=0;i<f.length;i++)
        {
            f[i].dibujar(g);
        }
    }
}