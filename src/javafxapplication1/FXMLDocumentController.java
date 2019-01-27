package javafxapplication1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

// ТУТ ОПИСЫВАЮТСЯ КОМПОНЕНТЫ И МЕТОДЫ
public class FXMLDocumentController implements Initializable {

    // Описание (подключение) компонента типа Label с именем "label" из файла FXML
    @FXML
    private Label label;

    // Описание обработчика нажатия с именем "handleButtonAction" для файла FXML
    @FXML
    private void handleButtonAction(ActionEvent event) {
        label.setText("Hello World!");
    }

    // Служебный метод для инициализации, запускается перед открытим окна (пустой)
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

}
