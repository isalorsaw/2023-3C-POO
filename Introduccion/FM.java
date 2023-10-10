import javax.swing.JOptionPane;
public class FM
{
    //Funcion que cuenta cuantas letras hay en una cadena
    public static int contarLetras(String cadena)
    {
        int c=0;
        //
        return c;
    }
    //Contar cuantos numeros hay en una cadena
    public static int contarNumeros(String cadena)
    {
        int c=0;
        
        for(int i=0;i<cadena.length();i++)
        {
            char l=cadena.charAt(i);
            if(l=='0'||l=='1'||l=='2'||l=='3'||l=='4'||l=='5'||l=='6'||
            l=='7'||l=='8'||l=='9')c++;
        }
        return c;
    }
    //Metodo que muestra letra por letra
    public static void mostrarLetraXLetra(String cadena)
    {
         for(int i=0;i<cadena.length();i++)
         {
             char l=cadena.charAt(i);
             mensaje(l+"");
         }
    }
    //Metodo que recibe una cadena y lo muestra en pantalla
    public static void mensaje(String msg)
    {
        JOptionPane.showMessageDialog(null,msg);
    }
    //Funcion que pide y valida un entero y lo retorna
    public static int pedirEntero(String msg)
    {
        boolean seguir=true;
        int num=0;
        do
        {
            try
            {
                String cadena=JOptionPane.showInputDialog(msg); 
                num=Integer.parseInt(cadena);
                seguir=false;
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Error al Ingresar un Entero");
            }
        }while(seguir==true);
        return num;
    }
    //Funcion que pide y valida un decimal y lo retorna
    public static double pedirDecimal(String msg)
    {
        boolean seguir=true;
        double num=0;
        do
        {
            try
            {
                String cadena=JOptionPane.showInputDialog(msg); 
                num=Double.parseDouble(cadena);
                seguir=false;
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Error al Ingresar un Entero");
            }
        }while(seguir==true);
        return num;
    }
    //Funcion que pide una cadena lo valida y lo retorna
    public static String pedirCadena(String msg)
    {
        String cadena="";
        
        ////
        
        return cadena;
    }
    //Funcion que invierta una cadena
    public static String invertir(String cadena)
    {
        String inv="";
        
        return inv;
    }
}