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
    //flags contain a time or effect based flag, a target that trips a flag, a trigger to determine if something happens, and a consequent effect
    //This class generates and handles a matrix of Triggers
    //rows are the flags, columns are the target
    Trigger flags[][][];
    
    Flags(int flags, int targets){
        this.flags=new Trigger[flags][targets][];
    }
    
    public void setTriggers(int flag, int target, Trigger triggerlist[]){
        flags[flag][target]=triggerlist;
    }
    
    public void startTrigger(int flag, int target, int trigger){
        flags[flag][target][trigger].start();
    }
    
    public void sleepTrigger(int flag, int target, int trigger){
        flags[flag][target][trigger].sleep();
    }
    
    public int[] liveTriggerList(int flag, int target){
        //works by checking the status of each trigger in a triggerlist of a given flag or target
        //and returning the indexes of all 'live triggers'
        List<Integer> idArray = new LinkedList<>(); //uses list to generate a list of abstract size
        for (int i=0; i<flags[flag][target].length; i++) {
            if(flags[flag][target][i].status()){                //if true, add to list
                idArray.add(flags[flag][target][i].getID());
            }
        }
        int[] id = idArray.stream().mapToInt(Integer::intValue).toArray(); //convert list back to basic array datatypes
        return id;
    }
    
    public boolean status(int flag, int target, int trigger){
        return flags[flag][target][trigger].status();
    }
    
}
