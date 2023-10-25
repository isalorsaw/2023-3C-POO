public class Carro
{
    //Atributos  
    private String marca;
    private String modelo;
    String placa;
    String color;
    
    //Constructor
    public Carro()
    {
        marca="";
        modelo="";
        placa="";
        color="";
    }
    public Carro(String marca,String modelo,String color)
    {
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
        this.placa="";
    }
    public Carro(String marca,String modelo,String placa,String color)
    {
        this.marca=marca;
        this.modelo=modelo;
        this.placa=placa;
        this.color=color;
    }
    //setters (metodo)
    public void setMarca(String marca)
    {
        this.marca=marca;
    }
    public void setModelo(String modelo)
    {
        this.modelo=modelo;
    }
    //getters
    public String getMarca()
    {
        return marca;
    }
    public String getModelo()
    {
        return modelo;
    }
    //Funcion - NO SE COLOCA STATIC
    public String toString()
    {
        return "Marca: "+marca+"\nModelo: "+modelo+"\nPlaca: "+placa+"\nColor: "+color;
    }
}