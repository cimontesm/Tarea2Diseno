/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deber.codigo;

/**
 *
 * @author CMONTES
 */
public class BeverageService extends AdditionalServiceDecorator {

    public BeverageService(BookingService service) {
        super(service);
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + 20.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Beverage Service";
    }

}
