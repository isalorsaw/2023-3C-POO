import javax.swing.JOptionPane;
public class EjemploBuscarLetra
{
    public static void main(String a[])
    {
        String cadena="LaCeiba";
        //String cadena=FM.pedirCadena("Ingrese una Cadena");
        char letra='O';
        //char letra=FM.pedirLetra("Ingrese una Letra para Buscar en "+cadena);
        boolean b=FM.buscarLetra2(cadena,letra);
        //FM.mensaje(b+"");
        if(b==true)FM.mensaje(letra+" Si Esta en "+cadena);
        else FM.mensaje("NO Esta");
        
        
        
        /*String cadena="Laceiba";
        String mayuscula=cadena.toUpperCase();
        String minuscula=cadena.toLowerCase();
        FM.mensaje(cadena+" MAY "+mayuscula+" MIN "+minuscula);
        
        char le='m';
        String letra=le+"";
        letra=letra.toUpperCase();
        FM.mensaje("Letra Original "+le+" Letra Mayuscula "+letra);*/
        //char le='m';
        //String letra1=le+"";
    }
}