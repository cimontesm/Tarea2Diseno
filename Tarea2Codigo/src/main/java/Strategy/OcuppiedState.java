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
public class OcuppiedState implements CabinState {

    @Override
    public void cabinState(Cabin cabin) {
        cabin.setState("Ocupada");
    }

}