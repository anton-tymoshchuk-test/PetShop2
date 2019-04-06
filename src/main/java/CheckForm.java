import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.ResourceBundle;

import com.sun.prism.shader.DrawPgram_RadialGradient_PAD_AlphaTest_Loader;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
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

        checkNumberId.setText(String.valueOf(AppState.checkNumber));
        nameId.setText(AppState.productName);
        priceId.setText(String.valueOf(AppState.price));

        Database.connect();
        Database.create();
        Database.makeReceipt(AppState.productName, AppState.price, AppState.currentWorkerName);
        Database.close();

        dateId.setText(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(Calendar.getInstance().getTime()));

        sellerId.setText(AppState.currentWorkerName);
    }
}
