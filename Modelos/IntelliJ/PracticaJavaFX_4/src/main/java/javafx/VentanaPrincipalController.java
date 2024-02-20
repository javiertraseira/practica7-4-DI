/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package javafx;

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
 * @author Javier
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
    
    private Personas modelopersonas;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        modelopersonas = new Personas();
        Vistaelementos.setItems(modelopersonas.getPersonas());
    }  
    
   public void setModeloPersonas(Personas modelopersonas) {
        this.check_item1.setSelected(this.modelopersonas.getCheck1()); 
        this.check_item2.setSelected(this.modelopersonas.getCheck2());        
    }    

    @FXML
    private void nueva_ventana(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/javafx/VentanaSecundaria.fxml"));
        Pane root = (Pane) loader.load();

        //Actualizar información del modelo

        Scene scene = new Scene(root);
        Stage stageWindow = new Stage();
        stageWindow.setTitle("Ventana Secundaria");
        stageWindow.setScene(scene);
        stageWindow.show();

        //Regenerar información

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
