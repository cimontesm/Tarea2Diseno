/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainOfResponsibility;

/**
 *
 * @author CMONTES
 */
public class Incident {

    public String description;
    public String level;

    //este es el metodo donde se maneja el incidente
    public void handle(Incident incident) {

    }
    
    public String getDescription() {
        return description;
    }

}
