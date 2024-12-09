/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainOfResponsibility;

/**
 *
 * @author CMONTES
 */
public abstract class IncidentHandler implements Handler {

    protected Handler nextHandler;

    @Override
    public void setNext(Handler nexthandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(Incident incident) {
        //todo
    }

}
