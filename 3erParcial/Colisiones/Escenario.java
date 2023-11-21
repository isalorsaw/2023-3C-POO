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
    Fondo f;
    Timer t;
    Carro c;
    Roca r;
    public Escenario()
    {
        f=new Fondo(0,0,"fondo.jpg");
        c=new Carro(30,270,"carroder.png");
        r=new Roca(300,270,"rock.png");
        
        t=new Timer(5,null);
        t.start();
        t.addActionListener(this);
        addKeyListener(this);
        
        setFocusable(true); 
        setVisible(true);
        setSize(f.ancho,f.alto+100);
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
    public void keyReleased(KeyEvent evt)
    {
        //JOptionPane.showMessageDialog(null,""+evt.getKeyCode());
        int code=evt.getKeyCode();
        if(code==39)c.mover('d');
        boolean b=c.detectarChoque(r.rec);
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
        g.drawString("Elaborado por: Ing. Isaias L. Salinas",500,500);
    }
}