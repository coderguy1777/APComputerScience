package ButtonInterface;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.stage.WindowEvent;

import java.io.IOException;


public class ButtonRun extends Application {
    public static void main(String[]args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane tester = new StackPane();


        String initial = "Initial State";
        Button button = new Button();
        button.setText(initial);
        ButtonImplement buttonImplement = new ButtonImplement();
        tester.getChildren().add(button);

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                button.setText(buttonImplement.state());
                try {
                    Runtime.getRuntime().exec(new String[]{"cmd", "/c","start chrome https://www.youtube.com/watch?v=6AquCxg1Fxw"});
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        Button button2 = new Button("Return the intial state");
        tester.getChildren().add(button2);
        button2.setOnAction(event -> button.setText(initial));
        button2.setTranslateY(200);
        button2.setFont(new Font("Times New Roman", 20));
        System.out.println(buttonImplement.state());
        buttonImplement.push();

        Scene scene = new Scene(tester, 800, 600);
        primaryStage.setTitle("My Epic Button.exe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
