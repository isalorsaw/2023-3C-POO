public class Consultor extends Trabajador
{
    int hora;
    double tarifa;
    public Consultor()
    {
        super();
        hora=FM.pedirEntero("Ingrese el Numero de Horas");
        tarifa=FM.pedirDecimal("Ingrese la tarifa para Hora Extra");
    }
    public Consultor(String nombre,String direccion,String puesto,String fnac,
    String fcontra,String cedula,int hora,double tarifa)
    {
        super(nombre,direccion,puesto,fnac,fcontra,cedula);
        this.hora=hora;
        this.tarifa=tarifa;
    }
    public double calculaPaga()
    {
        return hora*tarifa;
    }
    public String toString()
    {
        return "Tipo Consultor "+super.toString()+" Hora: "+hora+" Tarifa "+tarifa+
        " Pagar: "+calculaPaga();
    }
}