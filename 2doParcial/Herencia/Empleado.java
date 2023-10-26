public class Empleado extends Trabajador
{
    double salario,imp;
    final double pimp=0.05;
    public Empleado()
    {
        //pendiente
        super();
        salario=FM.pedirDecimal("Ingrese su Salario");
    }
    public Empleado(String nombre,String direccion,String puesto,String fnac,
    String fcontra,String cedula,double salario)
    {
        super(nombre,direccion,puesto,fnac,fcontra,cedula);
        this.salario=salario;
        this.imp=0;
        this.imp=imp;
    }
    public double calculaPaga()
    {
        imp=salario*pimp;
        return salario-(imp);
    }
    public String toString()
    {
        return "Tipo Empleado "+super.toString()+" Salario: "+salario+" Impuesto "+imp+
        " Pagar: "+calculaPaga();
    }
}