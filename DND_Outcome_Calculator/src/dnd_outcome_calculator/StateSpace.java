/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dnd_outcome_calculator;
import dnd_outcome_calculator.*;
/**
 *
 * @author Emilia Skye Hills - HLLMIC031 - University of Cape Town
 */
public class StateSpace {//might need to just move all this into main
    //NB Idea Damage valued at percentage of boss remaining health
    
    /*
    Standard Steps are as follows:
        0       Combat Start
        1       Turn Start
        2       Turn End
        3       Roll d20
        4       Action
        5       Magic Action
        6       Saving Throw
        7       Attack Action
        8       Attack
        9       Attacked
        10      Hit
        11      Move
        12      Move into
        13      Move through
        14      Move From
        15      Leave Melee Range
        16      Dash
        17      Disengage
        18      Bonus Action
    */
    //reminder, make all of these into seperate integers, also make creatures generate critical ones for themself
    
    private int steps = 15;//is incomplete
    
    /*
    Targets are as follows:
    0           All
    1           Boss
    2           Party (refers to Player1 through Player4)
    3 - 6       Player1-Player4
    7 - 150     Square1-144 (Chess grid A1 = first A2 = second etc.)    (additionally, this refers to any other target in a relevant square)
    */
    //reminder, make all of these into seperate integers
    
    private int targets = 150;//incomplete
    
    public Flags flags=new Flags(steps, targets);
    
    //trigger lists include effects (like attack) with each relevant condition (like advantage)
}
