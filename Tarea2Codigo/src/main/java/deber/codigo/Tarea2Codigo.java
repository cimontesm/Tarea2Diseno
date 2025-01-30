/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package deber.codigo;
import java.time.*;
import java.util.Scanner;

/**
 *
 * @author CMONTES
 */
public class Tarea2Codigo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User user = crearUsuario();
        if (!autenticarUsuario(scanner, user)) {
            return;
        }

        Cabin cabin = seleccionarCabina(scanner);
        if (cabin == null) {
            System.out.println("Opción inválida.");
            return;
        }

        BookingService booking = seleccionarServiciosAdicionales(scanner);
        double totalCost = booking.calculateCost();

        if (procesarReserva(cabin, totalCost)) {
            procesarPago(totalCost);
        }

        manejarIncidentes(scanner);
        System.out.println("Adios");
    }

    private static User crearUsuario() {
        User user = new User("ceci", "1234", "Cecilia Montes", "ceci@mail.com");
        NotificationCenter notificationCenter = new NotificationCenter();
        notificationCenter.addSubscriber(user);
        return user;
    }

    private static boolean autenticarUsuario(Scanner scanner, User user) {
        System.out.print("Ingrese usuario: ");
        String inputUser = scanner.nextLine();
        System.out.print("Ingrese contraseña: ");
        String inputPass = scanner.nextLine();
        return user.login(inputUser, inputPass);
    }

    private static Cabin seleccionarCabina(Scanner scanner) {
        System.out.println("Seleccione tipo de cabina: 1) Suite  2) Balcón  3) Interior  4) Familiar");
        int choice = scanner.nextInt();

        CabinFactory factory = switch (choice) {
            case 1 ->
                new SuiteFactory();
            case 2 ->
                new BalconyCabinFactory();
            case 3 ->
                new InteriorCabinFactory();
            case 4 ->
                new FamilyCabinFactory();
            default ->
                null;
        };

        if (factory != null) {
            Cabin cabin = factory.createCabin();
            cabin.setState(CabinState.AVAILABLE);
            return cabin;
        }
        return null;
    }

    private static BookingService seleccionarServiciosAdicionales(Scanner scanner) {
        BookingService booking = new BasicBooking();
        System.out.println("¿Desea agregar servicios adicionales? 1) Bebidas 2) Servicio en Habitación 3) Spa 4) Ninguno");
        int extraService = scanner.nextInt();

        return switch (extraService) {
            case 1 ->
                new BeverageService(booking);
            case 2 ->
                new InRoomService(booking);
            case 3 ->
                new SpaService(booking);
            default ->
                booking;
        };
    }

    private static boolean procesarReserva(Cabin cabin, double totalCost) {
        NotificationCenter notificationCenter = new NotificationCenter();
        Reserva reserva = new Reserva(1, cabin, "Pendiente", LocalDate.now(), notificationCenter, totalCost);
        return reserva.confirmarReserva();
    }

    private static void procesarPago(double totalCost) {
        Pago pago = new Pago(1, totalCost);
        pago.procesarPago();
        System.out.println("Pago procesado exitosamente. Monto: $" + totalCost);
    }

    private static void manejarIncidentes(Scanner scanner) {
        System.out.println("¿Desea reportar un incidente? 1) Sí  2) No");
        int incidentChoice = scanner.nextInt();
        scanner.nextLine();

        if (incidentChoice == 1) {
            System.out.print("Ingrese la descripción del incidente: ");
            String description = scanner.nextLine();
            System.out.print("Ingrese el nivel del incidente (low/high): ");
            String level = scanner.nextLine();

            Incident incident = new Incident(description, level);
            CustomerService customerService = new CustomerService();
            customerService.handle(incident);
        }
    }
}
