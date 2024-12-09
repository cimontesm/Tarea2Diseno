/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

/**
 *
 * @author CMONTES
 */
public class InteriorCabin extends Cabin {

    //tipo de la cabina
    @Override
    public void setType(String type) {
        this.type = "Interior";
    }

}
