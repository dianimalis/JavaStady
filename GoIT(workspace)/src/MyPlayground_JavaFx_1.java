import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Created by MARIA on 08.10.17.
 */
public class MyPlayground_JavaFx_1 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("My First Window");
        primaryStage.setWidth(300);
        primaryStage.setHeight(300);

        Pane root = new Pane();
        Button button = new Button();
        button.setText("Click me!");

        button.setTextFill(Color.BURLYWOOD);


        button.setTranslateX(105);
        button.setTranslateY(140);

        button.setPrefSize(100,20);


        Rectangle rect = new Rectangle(50,50);
        rect.setTranslateX(130);
        rect.setTranslateY(50);
        rect.setFill(Color.BLUEVIOLET);


        Text text = new Text("Look at the rectangle!");
        text.setTranslateX(100);
        text.setTranslateY(20);
        text.setFont(Font.font("HELVETICA"));

        button.setOnAction(event -> {
            rect.setFill(Color.RED);
            System.out.println("Ha!You clicked!");

        });




        Scene scene = new Scene(root);


        root.getChildren().addAll(button,rect,text);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
