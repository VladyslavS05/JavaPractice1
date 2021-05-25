package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Label lbl_Result;
    @FXML
    private TextArea txb_Input;

    @FXML
    private void Odd_Even(ActionEvent event){

        int num = Integer.parseInt(txb_Input.getText());

        if(num % 2 == 0){
            lbl_Result.setText("Це парне число.");
        }else{
            lbl_Result.setText("Це непарне число.");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
