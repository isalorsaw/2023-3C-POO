import javax.swing.JOptionPane;
public class FM
{
    //Funcion que valida y pide una posicion en una cadena
    public static int pedirPosicion(String cadena)
    {
        int p=0;
        boolean seguir=true;
        
        do
        {
            p=pedirEntero("Ingrese una Posicion Valida de "+cadena+" de 1 a "+cadena.length());
            if(p>=1&&p<=cadena.length())seguir=false;
            
        }while(seguir);
        
        return p;
    }
    //Funcion que retorna la primera letra de la cadena
    public static char primeraLetra(String cadena)
    {
        char le=cadena.charAt(0);
        return le;
        //String cadena=JOptionPane.showInputDialog("Ingrese una Cadena");
        //return cadena.charAt(0);
    }
    //Funcion que cuenta cuantas letras hay en una cadena
    public static int contarLetras(String cadena)
    {
        int c=0;
        
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
    //Funcion que retorna un v o f si encuentra la letra o no
    public static boolean buscarLetra(String palabra,char letra)
    {
        boolean b=false;
        
        for(int i=0;i<palabra.length();i++)
        {
            char le=palabra.charAt(i);
            if(letra==le)b=true;
        }
        return b;
    }
    //Funcion que busque letra mayuscula o minuscula
    public static boolean buscarLetra2(String palabra,char letra)
    {
        boolean b=false;
        
        //Convertir Palabra en Mayuscula
        palabra=palabra.toUpperCase();
        //Convertir la letra a buscar en Mayuscula
        String letram=letra+"";
        letra=letram.toUpperCase().charAt(0);
        
        //FM.mensaje(palabra+" "+letra);
        
        for(int i=0;i<palabra.length();i++)
        {
            char le=palabra.charAt(i);
            if(letra==le)b=true;
        }
        return b;
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