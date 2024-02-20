/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Javi
 */
public class ModeloElementos {
    private ObservableList<String> elementos;
    
    public ModeloElementos() {
        this.elementos = FXCollections.observableArrayList();
        elementos.add("Javier");
        elementos.add("Ivan");    
        elementos.add("Ruben"); 
        elementos.add("Jesus");         
    }
    
    public ObservableList<String> getPersonas() {
        return elementos;
    }


    
    
}
