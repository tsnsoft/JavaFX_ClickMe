package javafxapplication1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class JavaFXApplication1 extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Зададим заголовок программы
        stage.setTitle("JavaFX_ClickMe");

        // Загружаем разметку окна из файла
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

        // Создаем новую "сцену" из загруженного окна
        Scene scene = new Scene(root);

        // Готовим сцену на обозрение
        stage.setScene(scene);

        // "Открываем занавес" сцены
        stage.show();
    }

    public static void main(String[] args) {
        launch(args); // Старт программы
    }

}
