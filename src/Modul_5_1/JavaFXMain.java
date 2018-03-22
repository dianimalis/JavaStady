package Modul_5_1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * Created by dianimalis on 22.03.2018.
 */
public class JavaFXMain extends Application{
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        //code
        Pane root = new Pane(); //создаем пустую панель
        Line line = new Line(10, 10, 300, 300); // создаем линию
        root.getChildren().addAll(line); // кладем линию на пустую панель

        Scene scene = new Scene(root); // Создаем Сцену и кладем в нее пустую панельку
        primaryStage.setScene(scene); // привязываем окно программы к нашей сцене

        primaryStage.show(); // отображаем окно
    }

}
