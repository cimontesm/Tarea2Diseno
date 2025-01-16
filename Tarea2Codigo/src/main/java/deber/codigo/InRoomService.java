/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deber.codigo;

/**
 *
 * @author CMONTES
 */
public class InRoomService extends AdditionalServiceDecorator {

    public InRoomService(BookingService service) {
        super(service);
    }

    public double calculateCost() {
        return super.calculateCost() + 30.0;
    }

    public String getDescription() {
        return super.getDescription() + " + In-Room Service";
    }
}
