import javax.swing.JOptionPane;
public class FM
{
    public static void mensaje(String msg)
    {
         JOptionPane.showMessageDialog(null,msg);   
    }
    public static int pedirEntero(String msg)
    {
        int n=0;
        boolean seguir=true;
        do
        {
            try
            {
                n=Integer.parseInt(JOptionPane.showInputDialog(msg));
                seguir=false;
            }
            catch(Exception exp){}
            
        }while(seguir);
        return n;
    }
    public static double pedirDecimal(String msg)
    {
        double n=0;
        boolean seguir=true;
        do
        {
            try
            {
                n=Double.parseDouble(JOptionPane.showInputDialog(msg));
                seguir=false;
            }
            catch(Exception exp){}
            
        }while(seguir);
        return n;
    }
    public static String pedirCadena(String msg)
    {
        String cadena="";
        boolean seguir=true;
        do
        {
            try
            {
                cadena=JOptionPane.showInputDialog(msg);
                if(cadena.length()>0)seguir=false;
            }
            catch(Exception exp){}
            
        }while(seguir);
        return cadena;
    }
    
}