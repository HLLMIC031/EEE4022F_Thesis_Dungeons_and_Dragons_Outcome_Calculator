/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dnd_outcome_calculator;

/**
 *
 * @author Emilia Skye Hills - HLLMIC031 - University of Cape Town
 */
public class Trigger {
    //
    //
    private boolean active;
    private int effectID; //0 means no related effect
    
    Trigger(){
        active=false;
        effectID=0;
    }
    
    public void start(int effectID){
        active=true;
        this.effectID=effectID;
    }
    
    public void start(){
        active=true;
    }
    
    public void sleep(){
        active=false;
    }
    
    public boolean status(){
        return this.active;
    }
    
    public int getID(){
        return effectID;
    }
    
}
