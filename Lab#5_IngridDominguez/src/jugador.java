/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1234
 */
public class jugador {
    private String nombre;
    private double precio;
    private String posicion;
    private boolean disponibildad;
    private double habilidad;
    private double tecnica;
    private double resistenciaFisica;

    public jugador() {
    }

    public jugador(String nombre, double precio, String posicion, boolean disponibildad,
            double habilidad, double tecnica, double resistenciaFisica) {
        this.nombre = nombre;
        this.precio = precio;
        this.posicion = posicion;
        this.disponibildad = disponibildad;
        this.habilidad = habilidad;
        this.tecnica = tecnica;
        this.resistenciaFisica = resistenciaFisica;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public boolean getDisponibildad() {
        return disponibildad;
    }

    public void setDisponibildad(boolean disponibildad) {
        this.disponibildad = disponibildad;
    }

    public double getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(double habilidad) {
        this.habilidad = habilidad;
    }

    public double getTecnica() {
        return tecnica;
    }

    public void setTecnica(double tecnica) {
        this.tecnica = tecnica;
    }

    public double getResistenciaFisica() {
        return resistenciaFisica;
    }

    public void setResistenciaFisica(double resistenciaFisica) {
        this.resistenciaFisica = resistenciaFisica;
    }

    @Override
    public String toString() {
        String d = "";
        if(disponibildad== true){
            d = "Disponible";
        }else{
            d = "No Disponible";
        }
        
        return "nombre= " + nombre + "\n posicion= " + posicion + "\n precio= $"+precio
               +"\n Disponibilidad= "+d+"\n\n" ;
    }
    
    
}
