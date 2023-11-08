import java.util.Random;
public class FM
{
    public static int generaAleatorio(int desde, int hasta)
    {
        Random numaleatorio=new Random();
        int n=numaleatorio.nextInt(hasta-desde+1)+desde;
        return n;
    }
}