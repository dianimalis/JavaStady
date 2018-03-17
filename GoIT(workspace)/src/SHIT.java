import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by MARIA on 08.10.17.
 */
public class SHIT extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane root = new Pane();
        primaryStage.setScene(new Scene(root));
//        root.getChildren().addAll()

        primaryStage.show();
    }

//    public void drawSnowman();


    private void drawCircle(Pane root) {
        Circle circle = new Circle(200, 200, 100);
        circle.setFill(Paint.valueOf("#FF0000"));
        root.getChildren().addAll(circle);

    }


    public static void main(String[] args) {
        launch(args);
        Scanner scanner = new Scanner(System.in);

//        Questioning part
        System.out.println("Please, enter the number of circles you would want the programme to use for drawing a snowman.");
        int circAm = scanner.nextInt();
        System.out.println("Please, enter the minimal radius for the circles.");
        double minR = scanner.nextDouble();
        System.out.println("Please, enter the maximal radius for the circles.");
        double maxR = scanner.nextDouble();
//        random(minR,maxR);
//        SHIT.drawCircle();



//        Circle[] circles = new Circle[circAm];

        Random r = new Random();

//        public static double random(double min, double max){
//            return min + Math.random() * (max-min);
//        }

//        for(int i = 0;i <circAm; i++) {
//            circles[i] = (10);
//        }



    }
}
