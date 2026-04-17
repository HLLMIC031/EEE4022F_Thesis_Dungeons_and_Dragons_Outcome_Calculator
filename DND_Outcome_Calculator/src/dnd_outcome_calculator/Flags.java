/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dnd_outcome_calculator;

import java.util.*;
import dnd_outcome_calculator.Trigger;
/**
 *
 * @author Emilia Skye Hills - HLLMIC031 - University of Cape Town
 */
public class Flags {
    //flags contain a time or effect based flag, a holder that's flag is referenced, a trigger to determine if something happens, and a consequent effect determined elsewhere
    //This class generates and handles a matrix of Triggers
    //rows are the flags, columns are the holder
    Trigger flags[][][];
    
    Flags(int flags, int holder){
        this.flags=new Trigger[flags][holder][];
    }
    
    public void setTriggers(int flag, int holder, Trigger triggerlist[]){
        flags[flag][holder]=triggerlist;
    }
    
    public void startTrigger(int flag, int holder, int trigger){
        flags[flag][holder][trigger].start();
    }
    
    public void sleepTrigger(int flag, int holder, int trigger){
        flags[flag][holder][trigger].sleep();
    }
    
    public int[] liveTriggerList(int flag, int holder){
        //checks the status of each trigger in a triggerlist of a given flag or holder
        //and returning the indexes of all 'live triggers'
        List<Integer> idArray = new LinkedList<>(); //uses list to generate a list of abstract size
        for (int i=0; i<flags[flag][holder].length; i++) {
            if(flags[flag][holder][i].status()){                //if true, add to list
                idArray.add(flags[flag][holder][i].getID());
            }
        }
        int[] id = idArray.stream().mapToInt(Integer::intValue).toArray(); //convert list back to basic array datatypes
        return id;
    }
    
    public boolean status(int flag, int holder, int trigger){
        return flags[flag][holder][trigger].status();
    }
    
}
