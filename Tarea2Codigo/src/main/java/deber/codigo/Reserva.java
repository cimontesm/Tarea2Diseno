/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deber.codigo;

import deber.codigo.Cabin;
import java.util.Date;

/**
 *
 * @author CMONTES
 */
public class Reserva {

    private int idReserva;
    private Cabin cabin;
    private String estado;
    private Date fechaReserva;
    private NotificationCenter notificationCenter;
    private double costo;

    public Reserva(int idReserva, Cabin cabin, String estado, Date fechaReserva, NotificationCenter notificationCenter, double costo) {
        this.idReserva = idReserva;
        this.cabin = cabin;
        this.estado = estado;
        this.fechaReserva = fechaReserva;
        this.notificationCenter = notificationCenter;
        this.costo = costo;
    }

    public boolean crearReserva() {
        this.estado = "Confirmada";
        notificationCenter.notifySubscriber("La reserva " + idReserva + " ha sido creada.");
        return true;
    }

    public boolean confirmarReserva() {
        if (cabin.getState() == CabinState.AVAILABLE) {
            cabin.setState(CabinState.RESERVED);
            notificationCenter.notifySubscriber("Su reserva ha sido confirmada para la cabina " + cabin.getType());
            return true;
        }
        System.out.println("No se puede reservar la cabina seleccionada.");
        return false;
    }

    public boolean modificarReserva(Date nuevaFecha) {
        this.fechaReserva = nuevaFecha;
        notificationCenter.notifySubscriber("La reserva " + idReserva + " ha sido modificada a la fecha " + nuevaFecha + ".");
        return true;
    }

    public boolean cancelarReserva() {
        this.estado = "Cancelada";
        cabin.setState(CabinState.AVAILABLE); // La cabina vuelve a estar disponible
        notificationCenter.notifySubscriber("La reserva " + idReserva + " ha sido cancelada.");
        return true;
    }
}
