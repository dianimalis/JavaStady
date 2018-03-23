package Modul_5_1;

import Modul_4.Recursion;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Created by dianimalis on 22.03.2018.
 */
public class AdvanceFXMain extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    private void calcFact(int n, Pane scrollRoot){
        scrollRoot.getChildren().clear();

        for (int i = 0; i < n; i++) {
            int x = i + 1;
            int fact = Recursion.fact(x);

            Text text = new Text("Факториал от " + x + " = " + fact);
            text.setTranslateX(10);
            text.setTranslateY(100 + 30 * i);
            scrollRoot.getChildren().addAll(text);
        }
    }
    private void drawCircle(Pane root){
        Circle circle = new Circle(200, 200, 100);
        circle.setFill(Paint.valueOf("FF0000"));
        root.getChildren().addAll(circle);
    }
    private void initViews(Pane root) {


        TextField inputTextField = new TextField("10");
        inputTextField.setTranslateX(10);
        inputTextField.setTranslateY(10);

        HBox hBox = new HBox();
        ScrollPane scrollPane = new ScrollPane(hBox);
        scrollPane.setFitToHeight(true);
        BorderPane borderPane = new BorderPane(scrollPane);
        borderPane.setTranslateX(10);
        borderPane.setTranslateY(60);

        //drawCircle(root);

        Button button = new Button("Считай!");
        button.setTranslateX(180);
        button.setTranslateY(10);

        button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                int n = Integer.parseInt(inputTextField.getText());
                calcFact(n, borderPane);
            }
        });
        root.getChildren().addAll(inputTextField, button, borderPane);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //code
        Pane root = new Pane(); //создаем пустую панель
        initViews(root);
        Scene scene = new Scene(root); // Создаем Сцену и кладем в нее пустую панельку
        primaryStage.setScene(scene); // привязываем окно программы к нашей сцене
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);

        //primaryStage.setX(Screen.getPrimary().getBounds().getWidth() - primaryStage.getMaxWidth());

        primaryStage.show(); // отображаем окно
    }
}
