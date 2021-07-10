/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author CARLOS CASTAÑEDA
 */
public class Carro {
    //Atributos
    private String marca;
    private int modelo;
    private String color;
    
    //Constructores
    //Ejecutar código cada vez que se crea un nuevo objeto
    public Carro() {
        System.out.println("CREANDO UN NUEVO CARRO.......");
    }

    public Carro(String marca, int modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        System.out.println("Creando carro desde el constructor con parámetros");
    }
    
    //Operaciones/Métodos
    public void encender(){
        System.out.println("Encendiendo carro..");
    }
    
    public void apagar(){
        System.out.println("Apagando carro..");
    }
    
    public void acelerar(){
        System.out.println("Acelerando el carro..");
    }
    
    public void frenar(){
        System.out.println("Frenando el carro..");
    }
    
    public void mostrarInformacion(){
        System.out.println("Mi carrito es de marca: " + this.getMarca() + " y es modelo: "+ this.getModelo()
                            + " y es de color: "+  this.getColor());
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca.toUpperCase();
    }

    /**
     * @return the modelo
     */
    public int getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    
}
