/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author CMONTES
 */
public class Crucero {

    private int id;
    private String nombre;
    private String destino;
    private Date fechaSalida;
    private int duracion;
    List<Crucero> info = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String obtenerDetalles() {
        return "Crucero{" + "id=" + id + ", nombre=" + nombre + ", destino=" + destino + ", fechaSalida=" + fechaSalida + ", duracion=" + duracion + '}';
    }
    
    public List<Crucero> buscarCrucero(){
        return info;
    }

}
