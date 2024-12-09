/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ChainOfResponsibility;

/**
 *
 * @author CMONTES
 */
public interface Handler {

    public void setNext(Handler handler);

    public void handle(Incident incident);
}
