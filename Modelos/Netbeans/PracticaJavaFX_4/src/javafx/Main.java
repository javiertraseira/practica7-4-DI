/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package javafx;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Javi
 */
public class Main extends Application {
    
    @Override
    public void start(Stage StageWindow) throws IOException {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("VentanaPrincipal.fxml"));
        Pane root = (Pane) loader.load();
        Scene scene = new Scene(root);
        //El stage inicial llega como parámetro
        StageWindow.setTitle("Ventana Principal");
        StageWindow.setResizable(false);
        StageWindow.setScene(scene);
        StageWindow.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
