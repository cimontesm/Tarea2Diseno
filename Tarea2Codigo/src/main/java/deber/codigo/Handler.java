/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package deber.codigo;

public interface Handler {

    void setNext(Handler handler);

    void handle(Incident incident);
}
