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

    //metodo para ir al siguente problema despues de resolver uno
    @Override
    public void setNext(Handler nexthandler) {
        this.nextHandler = nextHandler;
    }

    //aqui se maneja el incidente
    @Override
    public void handle(Incident incident) {
        //todo
    }

}
