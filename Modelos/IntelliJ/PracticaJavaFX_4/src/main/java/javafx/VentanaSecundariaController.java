/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package javafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

/**
 * FXML Controller class
 *
 * @author Javier
 */
public class VentanaSecundariaController implements Initializable {
   
    @FXML
    private ListView<String> Vistaelementos;


    //variables internas
    private Personas modelopersonas;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    


    @FXML
    private void borrar(ActionEvent event) {
        Vistaelementos.getItems().remove(Vistaelementos.getSelectionModel().getSelectedItem());
    }
    
}
