package HomeWorks;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Created by MARIA on 08.10.17.
 */
public class HomeWork6 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane root = new Pane();

//        primaryStage.setWidth(300);
//        primaryStage.setHeight(300);
        primaryStage.setTitle("HomeWork 6");

        double getWidth = primaryStage.getWidth();
        double middleW = getWidth/2;


        Circle circle = new Circle(200,200,100);
        circle.setTranslateX(10);
        circle.setTranslateY(50);

        circle.setFill(Color.RED);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        root.getChildren().addAll(circle);
        primaryStage.show();

    }



    public static void main(String[] args) {
        launch(args);


    }
}
