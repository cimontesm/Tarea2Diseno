/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deber.codigo;

/**
 *
 * @author CMONTES
 */
public class User {

    private String name;
    private String email;
    private String username;
    private String password;

    public User(String username, String password, String name, String email) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
    }

    public boolean login(String username, String password) {
        if (this.username.equals(username) && this.password.equals(password)) {
            System.out.println("Login exitoso. Bienvenido, " + name);
            return true;
        }
        System.out.println("Usuario o contraseña incorrectos.");
        return false;
    }

    //aqui el usuario es actualizado sobre la notificacion
    public void update(String notification) {
        System.out.println("Notificación para " + name + ": " + notification);
    }
}
