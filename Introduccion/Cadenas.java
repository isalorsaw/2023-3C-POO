import javax.swing.JOptionPane;
public class Cadenas
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
        String menu="Menu\n1.Ingrese Cadena\n2.Mostrar Primer Caracter"+
        "\n3.Mostrar Caracter por Caracter\n4.Mostrar Cadena Invertida\n5.Salir";
        
        boolean seguir=true;
        int opcion=0;
        String cadena="";
        //Ciclo DoWhile = Hacer Mientras
        do
        {
            String entrada=JOptionPane.showInputDialog(menu);
            opcion=Integer.parseInt(entrada);
            switch(opcion)//Estructura de Control (if..else if..else)
            {
                case 1:
                    cadena=JOptionPane.showInputDialog("Ingrese la Cadena");
                break;
                
                case 2:
                    if(cadena.length()>0)
                    {
                         char l=cadena.charAt(0);
                        JOptionPane.showMessageDialog(null,"El Primer Caracter es: "+l);   
                    }
                    else JOptionPane.showMessageDialog(null,"NO Hemos ingresado una Cadena");
                break;
                
                case 3:
                break;
                
                case 4:
                break;
                
                case 5:
                    seguir=false;
                break;
                
                case 6:
                    JOptionPane.showMessageDialog(null,cadena);
                break;
            }
        }
        while(seguir==true);
    }
}