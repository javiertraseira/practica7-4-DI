/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Javier
 */
public class Personas {
    private ObservableList<String> personas;
    private boolean check1;
    private boolean check2;
    
    
    public Personas() {
        this.personas = FXCollections.observableArrayList();
        personas.add("Javier");
        personas.add("Ivan");    
        personas.add("Ruben");
        personas.add("Jesus");     
        personas.add("Fatima");        
    }
    
    public ObservableList<String> getPersonas() {
        return personas;
    }

    public boolean getCheck1() {
        return check1;
    }

    public boolean getCheck2() {
        return check2;
    }

    public void setCheck1(boolean check1) {
        this.check1 = check1;
    }

    public void setCheck2(boolean check2) {
        this.check2 = check2;
    }
    
    
    
    
    
}
