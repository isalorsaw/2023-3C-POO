public class Trabajador
{
    String nombre,direccion,puesto,fnac,fcontra,cedula;
    public Trabajador(String nombre,String direccion,String puesto,String fnac,String fcontra,String cedula)
    {
        this.nombre=nombre;
        this.direccion=direccion;
        this.puesto=puesto;
        this.fnac=fnac;
        this.fcontra=fcontra;
        this.cedula=cedula;
    }
    public Trabajador()
    {
        
        //Pendiente
        nombre=FM.pedirCadena("Ingrese un Nombre");
        direccion=FM.pedirCadena("Ingrese la Direccion");
        puesto=FM.pedirCadena("Ingrese su Puesto");
        //completen fnac,fcontra,cedula
    }
    public String toString()
    {
        return "Nombre: "+nombre+" Direccion: "+direccion+" Puesto: "+puesto+" Fecha Nac: "+fnac+
        " Fecha Contratacion: "+fcontra+" Cedula: "+cedula;
    }
}