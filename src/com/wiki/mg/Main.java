package com.wiki.mg;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stageLogin) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/sample/FXML/login.fxml"));
        stageLogin.setScene(new Scene(root));
        stageLogin.initStyle(StageStyle.UNDECORATED);
        stageLogin.show();
    }


}