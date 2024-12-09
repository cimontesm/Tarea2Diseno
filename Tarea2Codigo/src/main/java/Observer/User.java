/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

/**
 *
 * @author CMONTES
 */
public class User {

    public String name;
    public String email;

    public void update(String notification) {
        System.out.println("Notificación para " + name + ": " + notification);
    }
}
