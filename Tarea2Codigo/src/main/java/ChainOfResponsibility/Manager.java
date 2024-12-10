/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainOfResponsibility;

public class Manager extends IncidentHandler {

    @Override
    public void handle(Incident incident) {
        if (incident.getLevel().equalsIgnoreCase("high")) {
            System.out.println("Manager resolved the incident: " + incident.getDescription());
        } else {
            System.out.println("Manager cannot handle the incident: " + incident.getDescription());
        }
    }
}
