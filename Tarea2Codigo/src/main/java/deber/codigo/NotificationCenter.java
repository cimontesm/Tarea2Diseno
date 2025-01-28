/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deber.codigo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CMONTES
 */
public class NotificationCenter {
    private List<User> users = new ArrayList<>();
    

    public void addSubscriber(User user) {
        users.add(user);
    }
    
    public void deleteSubscriber(User user) {
        users.remove(user);
    }
    
    public void notifySubscriber(String message) {
        for (User user : users) {
            user.update(message);
        }
    }
    
}
