/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package javafx.controlador;

import Modelo.ModeloPersonas;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Javi
 */ 
public class VentanaPrincipalController implements Initializable {

    @FXML
    private ListView<String> Vistaelementos;
    @FXML
    private Button b_nuevo;
    @FXML
    private CheckBox check_item1;
    @FXML
    private CheckBox check_item2;
    
    private ModeloPersonas modelopersonas;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        modelopersonas = new ModeloPersonas();      
        Vistaelementos.setItems(modelopersonas.getPersonas());
    }  
    
   public void setModeloPersonas(ModeloPersonas modelopersonas) {
        this.check_item1.setSelected(this.modelopersonas.getCheck1()); 
        this.check_item2.setSelected(this.modelopersonas.getCheck2());        
    }    

    @FXML
    private void nueva_ventana(ActionEvent event) throws IOException {
        //carga una nueva vista
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/javafx/vista/VentanaSecundaria.fxml"));
        //carga la vista en el panel raiz
        Pane root = (Pane) loader.load();
         //los datos se pasan a la ventana a través de la clase ModeloPersonas   
        VentanaSecundariaController controlador = loader.getController();
        controlador.setModeloPersonas(modelopersonas);
        
        Scene scene = new Scene(root);
        //Se crea un nuevo stage
        Stage stageWindow = new Stage();
        stageWindow.setTitle("Ventana Secundaria");
        //stageWindow.initModality(Modality.APPLICATION_MODAL);
        stageWindow.setScene(scene);
        
        // hacer que espere para que le lleguen los datos de la ventana hija
        stageWindow.showAndWait();
        
        // aquí voy a repoblar la ventana hija
        this.check_item1.setSelected(this.modelopersonas.getCheck1()); 
        this.check_item2.setSelected(this.modelopersonas.getCheck2()); 
        
    }

    @FXML
    private void item1_changed(ActionEvent event) {
         this.modelopersonas.setCheck1(this.check_item1.isSelected());
    }

    @FXML
    private void item2_changed(ActionEvent event) {
         this.modelopersonas.setCheck2(this.check_item2.isSelected());
    }
    
}
