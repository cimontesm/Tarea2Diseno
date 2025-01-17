/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deber.codigo;

import java.util.Date;
import java.util.List;

/**
 *
 * @author CMONTES
 */
public class Itinerary {

    private int id;
    private List<Date> dates;
    private List<String> destiny;

    public boolean modifyItinerary(List<Date> newDates, List<String> newDestiny) {
        this.dates = newDates;
        this.destiny = newDestiny;
        return true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Date> getDates() {
        return dates;
    }

    public void setDates(List<Date> dates) {
        this.dates = dates;
    }

    public List<String> getDestiny() {
        return destiny;
    }

    public void setDestiny(List<String> destiny) {
        this.destiny = destiny;
    }

}
