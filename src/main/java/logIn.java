import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class logIn {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField logInText;

    @FXML
    private TextField passwordText;

    @FXML
    void ButtonOKClick(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert logInText != null : "fx:id=\"logInText\" was not injected: check your FXML file 'Untitled'.";
        assert passwordText != null : "fx:id=\"passwordText\" was not injected: check your FXML file 'Untitled'.";

    }
}
