
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1234
 */
public class equipo {
    private String nombre;
    private double presupuesto;
    private int copas;
    private String estadio;
    private ArrayList<jugador> jugadores  = new ArrayList();

    public equipo() {
    }

    public equipo(String nombre, double presupuesto, int copas, String estadio) {
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        this.copas = copas;
        this.estadio = estadio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public int getCopas() {
        return copas;
    }

    public void setCopas(int copas) {
        this.copas = copas;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public ArrayList<jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "equipo{" + "nombre=" + nombre + '}';
    }
    
    
}
