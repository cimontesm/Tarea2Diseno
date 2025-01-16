/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author CMONTES
 */
public class AdditionalServiceDecorator implements BookingService {

    protected BookingService bookingService;

    public AdditionalServiceDecorator(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @Override
    public double calculateCost() {
        return bookingService.calculateCost();
    }

    @Override
    public String getDescription() {
        return bookingService.getDescription();
    }
}
