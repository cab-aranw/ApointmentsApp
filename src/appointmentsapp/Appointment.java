/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appointmentsapp;

/**
 *
 * @author Cristy
 */

public abstract class Appointment 
{
    private String lastName ;
    private String description;
    private int militaryHour;
    private int militaryTime;
    private int militaryMinutes;

    public Appointment(String lastName, String description, int militaryHour, int militaryTime, int militaryMinutes) 
    {
        this.lastName = lastName;
        this.description = description;
        this.militaryHour = militaryHour;
        this.militaryTime = militaryTime;
        this.militaryMinutes = militaryMinutes;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMilitaryHour() {
        return militaryHour;
    }

    public void setMilitaryHour(int militaryHour) {
        this.militaryHour = militaryHour;
    }

    public int getMilitaryTime() {
        return militaryTime;
    }

    public void setMilitaryTime(int militaryTime) {
        this.militaryTime = militaryTime;
    }

    public int getMilitaryMinutes() {
        return militaryMinutes;
    }

    public void setMilitaryMinutes(int militaryMinutes) {
        this.militaryMinutes = militaryMinutes;
    }
    
    
    
    public abstract boolean occursOn(int year, int month, int day);
    
    
}
