public class Clase1610
{
    /*
       Menu
    1. Ingresar una Cadena.
    2. Convertir a Mayuscula.
    3. Convertir a Minusculas.
    4. Buscar Letra
    5. Si existe Letra enmedio.
    6. Salir
    7. Buscar Letra Mayuscula o Minuscula
       */
    
    public static String mayuscula(String cadena)
    {
        return cadena.toUpperCase();
    }
    public static String minuscula(String cadena)
    {
        return cadena.toLowerCase();
    }
    public static void main(String args[])
    {
         String cadena="";
         boolean seguir=true;
         int opcion=0;
         do
         {
             opcion=FM.pedirEntero("Menu\n1.Ingresar una Cadena\n2.Convertir a May"+
            "\n3.Convertir a Min\n4.Buscar Letra\n5.Si existe Letra enmedio"+
            "\n6. Salir\n7. Buscar Letra sin importar Mayuscula y Minuscula");
            
            if(opcion==1)
            {
                cadena=FM.pedirCadena("Ingrese una Cadena");
            }
            else if(opcion==2)
            {
                String mayus=mayuscula(cadena);
                FM.mensaje(cadena+" en mayuscula es "+mayus);
            }
            else if(opcion==3)
            {
                String minus=minuscula(cadena);
                FM.mensaje(cadena+" en minuscula es "+minus);
            }
            else if(opcion==4)
            {
                char le=FM.pedirLetra("Ingrese una Letra");
                boolean b=FM.buscarLetra(cadena,le);
                
                String resul="";
                if(b==true)resul="Si lo encontro";
                else resul="No lo encontro";
                FM.mensaje(resul);
                
                //String cadena=(b==true?"Si lo encontro":"No lo encontro");
            }
            else if(opcion==5)
            {
                boolean b=siExisteLetraMedio(cadena);
                FM.mensaje((b==true?"Si hay letra medio":"No hay letra medio"));
            }
            else if(opcion==6)seguir=false;
            else if(opcion==7)
            {
                char le=FM.pedirLetra("Ingrese una Letra");
                boolean b=buscarLetra(cadena,le);
                FM.mensaje((b==true?"Si lo encontro":"No lo encontro"));
            }
         }while(seguir);
    }
    public static boolean siExisteLetraMedio(String cadena)
    {
        //int tam=cadena.length();
        //if(tam%2==0)return false;
        //else return true;
        
        return (cadena.length()%2==0?false:true);
    }
    public static boolean buscarLetra(String cadena, char le)
    {
        //Convertir la cadena ingresada en mayuscula.
        String may=mayuscula(cadena);
        //Convertir la letra en una cadena
        String cle=le+"";
        //Convertir la letra en mayuscula
        cle=mayuscula(cle);
    
        for(int i=0;i<may.length();i++)
        {
            char l=may.charAt(i);
            if(cle.charAt(0)==l)return true;
        }
        FM.mensaje("Original "+cadena+" Mayuscula "+may+" Letra como Cadena "+cle);       
        return false;
    }
}