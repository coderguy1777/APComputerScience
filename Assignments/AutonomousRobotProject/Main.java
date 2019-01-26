package AutonomousRobotProject;
import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.shape.Box;

public class Main extends Application {
    public void start(Stage primaryStage)  {
        StackPane stackPane = new StackPane();
        StackPane stackPane2 = new StackPane();
        StackPane robotsettings = new StackPane();

        primaryStage.setTitle("My Auto Robot Project");
        Scene scene = new Scene(stackPane, 800, 600);
        Scene scene2 = new Scene(stackPane2, 800, 600);

        Label titlelab = new Label("Click the Button to Start my program, by inputting the amount of robots you'd like to face.");
        stackPane.getChildren().add(titlelab);
        titlelab.setFont(new Font("Sans", 15));
        titlelab.setTranslateY(-100);
        titlelab.getStyleClass().add("testclass");

        Box box = new Box();
        box.setHeight(20.0);
        box.setWidth(20.0);
        stackPane2.getChildren().add(box);

        Button scenemover = new Button("Click to see robocode from scratch.");
        stackPane.getChildren().add(scenemover);
        scenemover.setOnMouseClicked(event -> primaryStage.setScene(scene2));

        scene.getStylesheets().add(getClass().getResource("MainStyleSheet.css").toExternalForm());
        scene2.getStylesheets().add(getClass().getResource("MainStyleSheet.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[]args) {
        launch(args);
    }
}
