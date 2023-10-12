import javax.swing.JOptionPane;
public class Confusion
{
    public static void main(String args[])
    {
        String cadena="CostaRica";
        //String cadena=FM.pedirCadena("Ingrese una Palabra");
        char le=FM.primeraLetra(cadena);//Funcion=Asignado a una variable
        FM.mensaje("Primera Letra de "+cadena+" es "+le);//Metodo no tiene una asignacion a variable
        int posicion=FM.pedirPosicion(cadena);
        le=cadena.charAt(posicion-1);
        FM.mensaje(le+" esta en posicion "+posicion);
    }
}