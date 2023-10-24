import javax.swing.JOptionPane;
public class Test
{
    public static void main(String args[])
    {
        Carro c1=new Carro("Toyota","Corolla","HAB4356","Blanco");
        Carro c2=new Carro("Toyota","Corolla","Blanco");
        
        FM.mensaje(c1.toString());
        FM.mensaje(c2.toString());
        
        //Arreglo
        Carro c[]=new Carro[10];
        c[0]=new Carro();
        
        
        //FM.mensaje(c1+"");
    }
    
}