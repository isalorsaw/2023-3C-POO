import javax.swing.JOptionPane;
public class Test
{
    //Variables Globales
    public static Carro c[]=new Carro[3];
    public static int pos=0;
    public static void main(String args[])
    {
        //Variable Local
        //Carro c[]=new Carro[5];//Declarando
        inicializar();//Inicializar
        
        FM.mensaje(c[0].getMarca());
        FM.mensaje(c[0].modelo);
        
        
        String menu="Menu\n1.Ingresar Carro\n2.Imprimir Carros\n3.Salir";
        boolean seguir=true;
        int opcion=0;
        do
        {
            opcion=FM.pedirEntero(menu);
            switch(opcion)
            {
                case 1:
                    if(pos<c.length)ingresarCarro();
                    else FM.mensaje("Ya no se puede");
                break;
                
                case 2:
                    imprimirCarros();
                break;
                
                case 3:
                    seguir=false;
                break;
            }
            
        }while(seguir);
    
        //imprimirCarros();
    }
    public static void ingresarCarro()
    {
        String marca=FM.pedirCadena("Ingrese la Marca del Carro");
        String modelo=FM.pedirCadena("Ingrese el Modelo del Carro");
        String placa=FM.pedirCadena("Ingrese la Placa del Carro");
        String color=FM.pedirCadena("Ingrese el Color del Carro");
        c[pos]=new Carro(marca,modelo,placa,color);
        pos++;
    }
    public static void imprimirCarros()
    {
        String cadena="Listado de Carros\n";
        for(int i=0;i<c.length;i++)
        {
            cadena+="Carro #"+(i+1)+":\n"+c[i].toString()+"\n";
        }
        FM.mensaje(cadena);
    }
    public static void inicializar()
    {
        for(int i=0;i<c.length;i++)
        {
            c[i]=new Carro();
        }
    }
    public static void main1()
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