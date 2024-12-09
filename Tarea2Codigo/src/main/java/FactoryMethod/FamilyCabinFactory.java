/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

/**
 *
 * @author CMONTES
 */
public class FamilyCabinFactory implements CabinFactory {

    @Override
    public Cabin createCabin() {
        return new FamilyCabin();
    }

}
