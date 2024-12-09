/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy;

import FactoryMethod.Cabin;

/**
 *
 * @author CMONTES
 */
public class ReservedState implements CabinState {

    //estado de la cabina
    @Override
    public void cabinState(Cabin cabin) {
        cabin.setState("Reservada");
    }

}
