public class Test
{
    //Variable Globales
    static Trabajador t[]=new Trabajador[3];
    static int pos=0;
    public static void main(String args[])
    {
        String menu="Menu\n1.Ingresar Empleado\n2.Ingresar un Consultor\n3.Listar\n4.Salir";
        boolean seguir=true;
        int opcion=0;
        do
        {
            opcion=FM.pedirEntero(menu);
            if(opcion==1)
            {
                t[pos]=new Empleado();
                pos++;
            }
            else if(opcion==2)
            {
                t[pos]=new Consultor();
                pos++;
            }
            else if(opcion==3)
            {
                listar();
            }
            else if(opcion==4)
            {
                seguir=false;
            }
        }while(seguir);
    }
    public static void listar()
    {
        String cadena="Listado de Trabajadores\n";
        int i=0;
        while(i<pos)
        {
            //cadena+=t[i].toString()+"\n";
            cadena=cadena+t[i].toString()+"\n";
            i++;
        }
        FM.mensaje(cadena);
    }
}