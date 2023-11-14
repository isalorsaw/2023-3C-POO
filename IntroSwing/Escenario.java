import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Graphics;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Escenario extends JPanel implements KeyListener,ActionListener
{
    //Incorporar clases
    Timer t;
    Punto p;
    Barco b;
    Fondo f;
    Barco ba[];
    public Escenario()
    {
     
        //Generar un aleatorio.
        int xx=FM.generaAleatorio(50,750);
        System.out.println(xx);
        
        addKeyListener(this);//Agregar la escucha de las teclas
        setFocusable(true);//Importante para los eventos de las teclas
        
        p=new Punto(400,250);
        b=new Barco(100,430,"imagenes/barquito_d.png");
        f=new Fondo(0,0,"imagenes/fondo2.png");
        
        //Inicializar Arreglo de Barcos
        inicializarArreglo();
        
        
        t=new Timer(50,null);//Declarando e Inicalizando el Timer
        t.start();//Iniciando el Timer
        t.addActionListener(this);//Declaramos la accion del timer
        
        
        
        setSize(1000,570); 
    }
    public void inicializarArreglo()
    {
        ba=new Barco[4];
        
        for(int i=0;i<ba.length;i++)
        {
            int xx=FM.generaAleatorio(50,750);
            ba[i]=new Barco(xx,430,"imagenes/barquito_d.png");
        }
    }
    public void actionPerformed(ActionEvent evt)
    {
        /*if(b.x>50)
        {
             b.mover('i');   
        }
        else if(b.x<=50)
        {
             b.mover('d');   
        }*/
        
        b.mover('i');
        
        moverFlotaDer();
        
        System.out.println("Pos Barco "+b.toString());
        repaint();
    }
    public void moverFlotaDer()
    {
        for(int i=0;i<ba.length;i++)
        {
            ba[i].mover('d');
        }
    }
    public void keyReleased(KeyEvent e)//Suelto la tecla
    {
        
    }
    public void keyPressed(KeyEvent e)//Al presionar una tecla
    {
        int codigo=e.getKeyCode();
        System.out.println("Hola "+codigo);
        if(codigo==37)//Izquierda
        {
            //System.out.println("Barco a la Izq "+codigo);
            b.mover('i');
            repaint();
        }
        else if(codigo==39)
        {
            b.mover('d');
            repaint();
        }
    }
    public void keyTyped(KeyEvent evt)//Al presionar una tecla
    {
        
    }
    public void paint(Graphics g)
    {
        super.paint(g);//DobbleBuffer
        g.drawLine(50,300,750,300);
        f.dibujar(g);
        b.dibujar(g);
        p.dibujar(g);
        dibujarFlota(g);
        //g.drawString(b.toString(),b.x,b.y+70);
    }
    public void dibujarFlota(Graphics g)
    {
        for(int i=0;i<ba.length;i++)
        {
            ba[i].dibujar(g);
        }
    }
}