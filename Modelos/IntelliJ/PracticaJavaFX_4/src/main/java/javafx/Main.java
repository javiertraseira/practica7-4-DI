package javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/javafx/VentanaPrincipal.fxml"));
        Pane root = (Pane) loader.load();
        Scene scene = new Scene(root);
        stage.setTitle("Ventana Principal");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

}