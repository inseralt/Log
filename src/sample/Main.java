package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent parent = FXMLLoader.load(getClass().getResource("View.fxml"));

        Scene scene = new Scene(parent);
        scene.setFill(Color.TRANSPARENT);
        primaryStage.getIcons().add(new Image("file:number_2.ico"));

        primaryStage.initStyle(StageStyle.UTILITY);
        primaryStage.setScene(scene);
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.initStyle(StageStyle.TRANSPARENT);

        Rectangle2D screenBounds = Screen.getPrimary().getBounds();
        primaryStage.setX(screenBounds.getMaxX()-650);
        primaryStage.setY(0);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
