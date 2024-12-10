/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainOfResponsibility;

public class CustomerService extends IncidentHandler {

    @Override
    public void handle(Incident incident) {
        if (incident.getLevel().equalsIgnoreCase("low")) {
            System.out.println("Customer Service resolved the incident: " + incident.getDescription());
        } else {
            System.out.println("Customer Service escalates the incident: " + incident.getDescription());
            super.handle(incident);
        }
    }
}
