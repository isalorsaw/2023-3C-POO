import javax.swing.JOptionPane;
public class Peticion
{
    /*
        Ingrese una Cadena y mostre cuantos numeros existen
        Olimpia36 = Tiene 2 numeros
        Olimpia = Tiene 0 numeros
    */
    
    public static void main(String args[])
    {
        String cadena=JOptionPane.showInputDialog("Ingrese una Cadena");
        
        JOptionPane.showMessageDialog(null,cadena);
        
        //Tamanio de la Cadena
        int t=cadena.length();
        JOptionPane.showMessageDialog(null,cadena+" tiene "+t+" caracteres");
        
        //Recorrido de Cadena
        int contador=0;
        for(int i=0;i<cadena.length();i++)
        {
            char l=cadena.charAt(i);
            if(l=='0'||l=='1'||l=='2'||l=='3'||l=='4'||l=='5'||l=='6'||l=='7'
            ||l=='8'||l=='9')contador++;
        }
        JOptionPane.showMessageDialog(null,cadena+" tiene "+contador+" numeros");
    }
}