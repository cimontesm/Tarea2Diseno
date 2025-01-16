/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deber.codigo;

/**
 *
 * @author CMONTES
 */
public class SpaService extends AdditionalServiceDecorator {

    public SpaService(BookingService service) {
        super(service);
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + 50.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Spa Service";
    }
}
