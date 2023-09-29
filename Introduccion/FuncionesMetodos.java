import javax.swing.JOptionPane;
public class FuncionesMetodos
{
    /*
       Crear un Menu con las siguientes opciones
       1. Ingresar una Cadena.
       2. Mostrar el primer caracter.
       3. Mostrar caracter por caracter.
       4. Mostrar la cadena invertida.
       5. Salir
       */
    public static void main(String args[])
    {
        int numero1=pedirEntero("Ingrese un Numero");
        int numero2=pedirEntero("Ingrese otro Numero");
        int suma=numero1+numero2;
        mensaje("La suma es: "+suma);
    }
    //Funciones y Metodos
    //Metodo = void
    public static void mensaje(String msg)
    {
        JOptionPane.showMessageDialog(null,msg);
    }
    //Funcion = int, string, char, o cualquier tipo de variable
    public static int pedirEntero(String msg)
    {
        //Try Catch-Excepciones
        //VALIDACION
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
}