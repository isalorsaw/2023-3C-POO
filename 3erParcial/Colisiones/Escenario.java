import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.awt.Graphics;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
public class Escenario extends JPanel implements ActionListener, KeyListener
{
    int seg;
    Fondo f;
    Timer t;
    Carro c;
    Roca r;
    Nave n;
    Bala b[];
    String mensaje;
    public Escenario()
    {
        inicializarObjetos();
           
        seg=5;
        t=new Timer(seg,null);
        t.start();
        t.addActionListener(this);
        addKeyListener(this);
        
        setFocusable(true); 
        setVisible(true);
        setSize(f.ancho,f.alto+100);
    }
    public void inicializarObjetos()
    {
        f=new Fondo(0,0,"fondo.jpg");
        c=new Carro(30,270,"carroder.png");
        r=new Roca(400,270,"rock.png");
        n=new Nave(aleatorio(10,400),aleatorio(40,100),"nave.png");
        b=new Bala[0];
        mensaje="";
        seg+=5;
    }
    public void actionPerformed(ActionEvent e)
    {
        //gotasCayendo();
        //l.mover();
        //repaint();
    }
    public void keyPressed(KeyEvent evt)
    {
        
    }
    public void crearBala(int x, int y)
    {
        //System.out.println("Creando Bala "+x+" "+y);
        Bala tmp=new Bala(x,y,"laser.png");
        Bala arr[]=new Bala[b.length+1];
        for(int i=0;i<b.length;i++)
        {
            arr[i]=b[i];
        }
        arr[b.length]=tmp;
        b=new Bala[b.length+1];
        for(int i=0;i<arr.length;i++)
        {
            b[i]=arr[i];
        }
    }
    public void keyReleased(KeyEvent evt)
    {
        System.out.println(""+evt.getKeyCode());
        
        int code=evt.getKeyCode();
        if(code==39)c.mover('d');
        else if(code==65)n.mover('i');
        else if(code==68)n.mover('d');
        else if(code==32)crearBala(n.x,n.y);
            
        boolean b=c.detectarChoque(r.rec);
        if(b)
        {
            //c.visible=false;//Desaparece el carros si hay una colision
            //c.cambiarImagen("explosion.gif");//Que aparezca una explosion
            c.frenar=true;//Que el carro frene
            mensaje="Choque con Roca";
            int input = JOptionPane.showConfirmDialog(null, "Chocastes desea seguir");
            //JOptionPane.showMessageDialog(null,""+input);
            if(input==0)
            {  
                
                inicializarObjetos();
                repaint();
            }
            else if(input==1)
            {
                System.exit(0);
            }
        }
        
        
        System.out.println(b+"");
        repaint();
    }
    public void keyTyped(KeyEvent evt)
    {
        
    }
    /*public void gotasCayendo()
    {
        for(int i=0;i<go.length;i++)
        {
            go[i].cayendo();
        }
    }
    public void inicializarGotas()
    {
        for(int i=0;i<go.length;i++)
        {
            go[i]=new Gota(aleatorio(10,700),aleatorio(30,100),"gota.png");
        }
    }
    public void dibujarGotas(Graphics g)
    {
        for(int i=0;i<go.length;i++)
        {
            go[i].dibujar(g);        
        }
    }*/
    public int aleatorio(int d, int h)
    {
        return ((int)(Math.random()*(h-d+1)+d));
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        
        f.dibujar(g);
        //dibujarGotas(g);
        c.dibujar(g);
        r.dibujar(g);
        n.dibujar(g);
        g.drawString("Elaborado por: Ing. Isaias L. Salinas",500,500);
        g.drawString(mensaje,10,500);
    }
}