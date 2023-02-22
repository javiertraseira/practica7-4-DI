/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controlador;

import Modelo.ModeloElementos;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
    
    private ModeloElementos modeloelementos;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        modeloelementos = new ModeloElementos();      
        Vistaelementos.setItems(modeloelementos.getPersonas());
    }    

    @FXML
    private void nueva_ventana(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/VentanaSecundaria.fxml"));
        Pane root = (Pane) loader.load();
        

        
        Scene scene = new Scene(root);
        //Se crea un nuevo stage
        Stage stageWindow = new Stage();
        stageWindow.setTitle("Ventana Secundaria");
        //stageWindow.initModality(Modality.APPLICATION_MODAL);
        stageWindow.setScene(scene);
        stageWindow.show();
    }

    
}
