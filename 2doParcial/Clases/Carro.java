public class Carro
{
    //Atributos  
    String marca;
    String modelo;
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
    //Funcion - NO SE COLOCA STATIC
    public String toString()
    {
        return "Marca: "+marca+"\nModelo: "+modelo+"\nPlaca: "+placa+"\nColor: "+color;
    }
}