/*
 * Hacer un codigo que pida 5 numeros y mostrar cuantos fueron 
 * positivos y negativos
   */
  import javax.swing.JOptionPane;
  public class EjercicioClase
  {
      public static void main(String args[])
      {
          /*int num=0;
          
          for(int i=0;i<5;i++)
          {
              num=FM.pedirEntero("Ingrese un Numero");
          }*/
          
          String cadena="Honduras2023";
          int contar=FM.contarNumeros(cadena);
          FM.mensaje(cadena+" tiene "+contar+" numeros");
          
          FM.mostrarLetraXLetra(cadena);
      }
  }