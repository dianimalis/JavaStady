package Modul_5_1;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

/**
 * Created by dianimalis on 24.03.2018.
 */
public class FX_Project {
    private Stage stage;
    private Scene scene;
    private FlowPane pane;
    private Label label;

    @Override
    public void start(Stage stage){
        this.stage = stage;
        pane = new FlowPane();
        label = new Label("Hello World");
        pane.getChildren().add(label);
        scene = new Scene(pane, 640,480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
