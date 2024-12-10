/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainOfResponsibility;

public class Client {

    public static void main(String[] args) {

        CustomerService customerService = new CustomerService();
        Manager manager = new Manager();

        customerService.setNext(manager);

        Incident lowLevelIncident = new Incident("User can't login", "low");
        Incident highLevelIncident = new Incident("Database outage", "high");

        System.out.println("Handling low-level incident:");
        customerService.handle(lowLevelIncident);

        System.out.println("\nHandling high-level incident:");
        customerService.handle(highLevelIncident);
    }
}
