package oddeven;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class FXMLDocumentController implements Initializable {

    public Button btn_Click;
    @FXML
    private Label lbl_Result;
    @FXML
    private TextArea txb_Input;

    @FXML
    public void Odd_Even() {
        try {
            int num = Integer.parseInt(txb_Input.getText());

            if (num % 2 == 0) {
                lbl_Result.setText("Це парне число.");
            } else {
                lbl_Result.setText("Це непарне число.");
            }
        } catch (NumberFormatException e) {
            lbl_Result.setText("Введіть число!");
            //e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
