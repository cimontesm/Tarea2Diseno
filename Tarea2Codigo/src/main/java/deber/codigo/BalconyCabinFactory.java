/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deber.codigo;

/**
 *
 * @author CMONTES
 */
public class BalconyCabinFactory implements CabinFactory {

    //creacion de la cabina segun el tipo
    @Override
    public Cabin createCabin() {
        return new BalconyCabin();
    }

}
