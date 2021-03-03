package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ControllerAddView {
    private Data LobyData;

    @FXML
    private TextField Class, URL, Label, Position;

    @FXML
    void Added(ActionEvent event) {
        if(checker()) {
            this.LobyData = Save.charger();
            this.LobyData.add(Integer.parseInt(this.Position.getText()), this.Label.getText(), this.URL.getText(), this.Class.getText());
            Save.sauvegarder(this.LobyData);
        }
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    void Closed(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    public boolean checker(){
        try {
            if (Integer.parseInt(this.Position.getText()) <= 13 && Integer.parseInt(this.Position.getText()) > 0) {
                if(!this.Position.getText().isEmpty() && !this.Label.getText().isEmpty() && !this.URL.getText().isEmpty() && !this.Class.getText().isEmpty()){
                    return true;
                }
            }
            return false;
        }
        catch (Exception e){
            return false;
        }
    }

}
