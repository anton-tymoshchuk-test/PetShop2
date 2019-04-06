import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CheckForm {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label checkNumberId;

    @FXML
    private Label nameId;

    @FXML
    private Label priceId;

    @FXML
    private Label dateId;

    @FXML
    private Label sellerId;

    @FXML
    void initialize() {
        assert checkNumberId != null : "fx:id=\"checkNumberId\" was not injected: check your FXML file 'CheckFormFXML.fxml'.";
        assert nameId != null : "fx:id=\"nameId\" was not injected: check your FXML file 'CheckFormFXML.fxml'.";
        assert priceId != null : "fx:id=\"priceId\" was not injected: check your FXML file 'CheckFormFXML.fxml'.";
        assert dateId != null : "fx:id=\"dateId\" was not injected: check your FXML file 'CheckFormFXML.fxml'.";
        assert sellerId != null : "fx:id=\"sellerId\" was not injected: check your FXML file 'CheckFormFXML.fxml'.";

    }
}
