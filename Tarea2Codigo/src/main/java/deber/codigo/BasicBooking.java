/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deber.codigo;

/**
 *
 * @author CMONTES
 */
public class BasicBooking implements BookingService {

    @Override
    public double calculateCost() {
        return 100.0;
    }

    @Override
    public String getDescription() {
        return "Basic Cabin Booking";
    }

}
