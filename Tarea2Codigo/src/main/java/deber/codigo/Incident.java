/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deber.codigo;

public class Incident {

    private String description;
    private String level;

    public Incident(String description, String level) {
        this.description = description;
        this.level = level;
    }

    public String getDescription() {
        return description;
    }

    public String getLevel() {
        return level;
    }
}