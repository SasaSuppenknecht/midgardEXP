package com.example.midgardexpcalc;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class EXPCalculator extends javafx.application.Application {

    public static void wrapperLaunch() {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(EXPCalculator.class.getResource("main.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Main");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}