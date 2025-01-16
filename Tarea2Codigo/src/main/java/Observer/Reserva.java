/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

import FactoryMethod.Cabin;
import deber.codigo.CabinState;
import java.util.Date;

/**
 *
 * @author CMONTES
 */
public class Reserva {

    private String idReserva;
    private String estado;
    private Date fechaReserva;
    private NotificationCenter notificationCenter;
    private Cabin cabin;

    public Reserva(String idReserva, String estado, Date fechaReserva, NotificationCenter notificationCenter, Cabin cabin) {
        this.idReserva = idReserva;
        this.estado = estado;
        this.fechaReserva = fechaReserva;
        this.notificationCenter = notificationCenter;
        this.cabin = cabin;
    }

    public boolean crearReserva() {
        this.estado = "Confirmada";
        notificationCenter.notifySubscriber("La reserva " + idReserva + " ha sido creada.");
        return true;
    }

    public boolean modificarReserva(Date nuevaFecha) {
        this.fechaReserva = nuevaFecha;
        notificationCenter.notifySubscriber("La reserva " + idReserva + " ha sido modificada a la fecha " + nuevaFecha + ".");
        return true;
    }

    public boolean cancelarReserva() {
        this.estado = "Cancelada";
        this.cabin.setState("Disponible"); // La cabina vuelve a estar disponible
        notificationCenter.notifySubscriber("La reserva " + idReserva + " ha sido cancelada.");
        return true;
    }
}
