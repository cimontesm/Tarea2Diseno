/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deber.codigo;

public class CustomerService extends IncidentHandler {

    @Override
    public void handle(Incident incident) {
        if (incident.getLevel().equals("low")) {
            System.out.println("Customer Service handling incident: " + incident.getDescription());
        } else if (nextHandler != null) {
            nextHandler.handle(incident);
        }
    }
}
