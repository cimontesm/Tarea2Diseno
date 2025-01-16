/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package deber.codigo;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author CMONTES
 */
public class Tarea2Codigo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creación de usuario
        User user = new User("ceci", "1234", "Cecilia Montes", "ceci@mail.com");
        NotificationCenter notificationCenter = new NotificationCenter();
        notificationCenter.addSubscriber(user);

        System.out.print("Ingrese usuario: ");
        String inputUser = scanner.nextLine();
        System.out.print("Ingrese contraseña: ");
        String inputPass = scanner.nextLine();

        if (!user.login(inputUser, inputPass)) {
            return;
        }

        // Selección de cabina
        System.out.println("Seleccione tipo de cabina: 1) Suite  2) Balcón  3) Interior  4) Familiar");
        int choice = scanner.nextInt();
        CabinFactory factory = null;

        if (choice == 1) {
            factory = new SuiteFactory();
        } else if (choice == 2) {
            factory = new BalconyCabinFactory();
        } else if (choice == 3) {
            factory = new InteriorCabinFactory();
        } else if (choice == 4) {
            factory = new FamilyCabinFactory();
        }

        if (factory == null) {
            System.out.println("Opción inválida.");
            return;
        }

        Cabin cabin = factory.createCabin();
        cabin.setState(CabinState.AVAILABLE);

        // Preguntar por servicios adicionales
        BookingService booking = new BasicBooking();
        System.out.println("¿Desea agregar servicios adicionales? 1) Bebidas 2) Servicio en Habitación 3) Spa 4) Ninguno");
        int extraService = scanner.nextInt();

        if (extraService == 1) {
            booking = new BeverageService(booking);
        } else if (extraService == 2) {
            booking = new InRoomService(booking);
        } else if (extraService == 3) {
            booking = new SpaService(booking);
        }

        double totalCost = booking.calculateCost();

        // Creación de la reserva
        Reserva reserva = new Reserva(1, cabin, "Pendiente", new Date(), notificationCenter, totalCost);
        if (reserva.confirmarReserva()) {
            Pago pago = new Pago(1, totalCost);
            pago.procesarPago();
            System.out.println("Pago procesado exitosamente. Monto: $" + totalCost);
        }

        // Preguntar por incidentes
        System.out.println("¿Desea reportar un incidente? 1) Sí  2) No");
        int incidentChoice = scanner.nextInt();
        scanner.nextLine(); // Consumir nueva línea

        if (incidentChoice == 1) {
            System.out.print("Ingrese la descripción del incidente: ");
            String description = scanner.nextLine();
            System.out.print("Ingrese el nivel del incidente (low/high): ");
            String level = scanner.nextLine();

            Incident incident = new Incident(description, level);
            CustomerService customerService = new CustomerService();
            customerService.handle(incident);
        }
        
        System.out.println("Adios");
    }
}
