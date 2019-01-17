package lk.ijsc.dep.court.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Appinitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FileHandler fileHandler = new FileHandler("error.log", true);
        fileHandler.setFormatter(new SimpleFormatter());
        Logger.getLogger("").addHandler(fileHandler);

        Parent root = FXMLLoader.load(this.getClass().getResource("/lk/ijsc/dep/court/view/HomeForm.fxml"));

        Scene mainScene = new Scene(root);

        primaryStage.setTitle("COURT BOOKING SYSTEM");
        primaryStage.setScene(mainScene);
        primaryStage.setResizable(false);

        primaryStage.show();

    }
}
