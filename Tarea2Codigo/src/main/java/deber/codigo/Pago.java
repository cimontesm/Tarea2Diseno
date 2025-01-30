/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deber.codigo;

/**
 *
 * @author CMONTES
 */
public class Pago implements InterfacePago {

    private int idPago;
    private double monto;
    private String estado;

    public Pago(int idPago, double monto) {
        this.idPago = idPago;
        this.monto = monto;
        this.estado = "Pendiente";
    }

    @Override
    public boolean procesarPago() {
        this.estado = "Confirmado";
        //System.out.println("Pago procesado exitosamente.");
        return true;
    }

    @Override
    public boolean cancelarPago() {
        this.estado = "Cancelado";
        System.out.println("Pago cancelado exitosamente.");
        return true;
    }

    public String getEstado() {
        return estado;
    }

}
