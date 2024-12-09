/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CMONTES
 */
public class NotificationCenter {
    
    private List<User> users = new ArrayList<>();
    
    //se puede agregar un usuario para que reciba notificaciones
    public void addSubscriber(User user) {
        users.add(user);
    }
    
    //se puede eliminar un usario para que ya no reciba notificaciones
    public void deleteSubscriber(User user) {
        users.remove(user);
    }
    
    //en este se notifica al usuario subscrito
    public void notifySubscriber(String message) {
        for (User user : users) {
            user.update(message);
        }
    }
    
}
