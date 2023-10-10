import javax.swing.JOptionPane;
public class Pral
{
    public static void main(String args[])
    {
        //Pedir Dos numeros y mostrar la suma de ellos
        int numero1=FM.pedirEntero("Ingrese el Primer Entero");
        int numero2=FM.pedirEntero("Ingrese el Segundo Entero");
        int suma=numero1+numero2;
        FM.mensaje("La suma de los dos numeros es: "+suma);
        //FM f=new FM();
    }
}