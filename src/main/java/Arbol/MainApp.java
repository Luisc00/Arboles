package Arbol;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class MainApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        showMainStage(stage);
        showInfoStage();
    }

    // Método para iniciar la ventana principal
    private void showMainStage(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("arbolBinario.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 950, 650);
        stage.setTitle("Insercion en un grafo");
        stage.setScene(scene);
        stage.show();
    }

    // Método para iniciar la ventana de información
    private void showInfoStage() throws IOException {
        Stage infoStage = new Stage();
        FXMLLoader fxmlLoaderInfo = new FXMLLoader(getClass().getResource("informacion.fxml"));
        Scene scene = new Scene(fxmlLoaderInfo.load(), 950, 650);
        infoStage.setTitle("Informacion");
        infoStage.setScene(scene);
        infoStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
