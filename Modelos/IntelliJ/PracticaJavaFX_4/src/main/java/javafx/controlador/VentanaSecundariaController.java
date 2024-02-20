/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package javafx.controlador;

import Modelo.ModeloPersonas;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Javi
 */
public class VentanaSecundariaController implements Initializable {
   
    @FXML
    private ListView<String> Vistaelementos;
    @FXML
    private Button b_volver;
    @FXML
    private CheckBox check_item1;
    @FXML
    private CheckBox check_item2;    
    @FXML
    private Button b_cerrar;
    
    //variables internas
    private ModeloPersonas modelopersonas;

    public void setModeloPersonas(ModeloPersonas modelopersonas) {
        this.modelopersonas = modelopersonas;
        Vistaelementos.setItems(modelopersonas.getPersonas());
        this.check_item1.setSelected(this.modelopersonas.getCheck1()); 
        this.check_item2.setSelected(this.modelopersonas.getCheck2());        
    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    

    @FXML
    private void borrar(ActionEvent event) {
        Vistaelementos.getItems().remove(Vistaelementos.getSelectionModel().getSelectedItem());
    }

    @FXML
    private void item1_changed(ActionEvent event) {
        this.modelopersonas.setCheck1(this.check_item1.isSelected());
    }

    @FXML
    private void item2_changed(ActionEvent event) {
        this.modelopersonas.setCheck2(this.check_item1.isSelected());               
    }

    @FXML
    private void cerrar_ventana(ActionEvent event) {
        
        Stage stage = (Stage) this.b_cerrar.getScene().getWindow();
        stage.close();
        
    }
    
}
