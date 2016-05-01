package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.Window;

public class Main extends Application{

    Button button;
    Button button2;
    Stage window;
    Scene scene1, scene2;


    @Override
    public void start(Stage primaryStage) throws Exception{

        window = primaryStage;


        Label label= new Label("Welcome to scene 1");
            button = new Button("Click Me");
            button.setOnAction(e -> Alert.display("Alert Title", "This is label brah"));

        StackPane layout2 = new StackPane();
        layout2.getChildren().addAll(button);
        scene1 = new Scene(layout2, 800, 600);

        window.setTitle("Test Title");
        window.setScene(scene1);
        window.show();



    }


    public static void main(String[] args) {
        launch(args);
    }


}
