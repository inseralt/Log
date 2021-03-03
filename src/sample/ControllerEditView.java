package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.util.List;

public class ControllerEditView {

    @FXML
    private TextField TextField_URL, TextField_Class, TextField_Label;

    @FXML
    private CheckBox Remove;

    @FXML
    private Pane pane1, pane2, pane3, pane4, pane5, pane6, pane7, pane8, pane9, pane10, pane11, pane12, pane13;

    final String style = "-fx-background-color: BLACK;";
    final String stylenull = "-fx-border-color: #FFEAFF;";
    private Data LobyData;
    private int selected =0;

    @FXML
    void Closed(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    void Validate(ActionEvent event) {
        if(this.selected != 0){
            if(!this.Remove.isSelected()){
                String url = this.TextField_URL.getText();
                String label = this.TextField_Label.getText();
                String div = this.TextField_Class.getText();
                this.LobyData.add(this.selected,label,url,div);
            }else {
                this.LobyData.remove(this.selected);
            }
            Save.sauvegarder(this.LobyData);
        }
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    void Clicked1(MouseEvent event) {
        removeStyle();
        this.pane1.setStyle(style);
        List<String> token = this.LobyData.getoken(1);
        TextFieldChange(token);
        this.selected =1;
    }

    @FXML
    void Clicked2(MouseEvent event) {
        removeStyle();
        pane2.setStyle(style);
        List<String> token = this.LobyData.getoken(2);
        TextFieldChange(token);
        this.selected =2;
    }

    @FXML
    void Clicked3(MouseEvent event) {
        removeStyle();
        pane3.setStyle(style);
        List<String> token = this.LobyData.getoken(3);
        TextFieldChange(token);
        this.selected =3;
    }

    @FXML
    void Clicked4(MouseEvent event) {
        removeStyle();
        pane4.setStyle(style);
        List<String> token = this.LobyData.getoken(4);
        TextFieldChange(token);
        this.selected =4;
    }

    @FXML
    void Clicked5(MouseEvent event) {
        removeStyle();
        pane5.setStyle(style);
        List<String> token = this.LobyData.getoken(5);
        TextFieldChange(token);
        this.selected =5;
    }

    @FXML
    void Clicked6(MouseEvent event) {
        removeStyle();
        pane6.setStyle(style);
        List<String> token = this.LobyData.getoken(6);
        TextFieldChange(token);
        this.selected =6;
    }

    @FXML
    void Clicked7(MouseEvent event) {
        removeStyle();
        pane7.setStyle(style);
        List<String> token = this.LobyData.getoken(7);
        TextFieldChange(token);
        this.selected =7;
    }

    @FXML
    void Clicked8(MouseEvent event) {
        removeStyle();
        pane8.setStyle(style);
        List<String> token = this.LobyData.getoken(8);
        TextFieldChange(token);
        this.selected =8;
    }

    @FXML
    void Clicked9(MouseEvent event) {
        removeStyle();
        pane9.setStyle(style);
        List<String> token = this.LobyData.getoken(9);
        TextFieldChange(token);
        this.selected =9;
    }

    @FXML
    void Clicked10(MouseEvent event) {
        removeStyle();
        pane10.setStyle(style);
        List<String> token = this.LobyData.getoken(10);
        TextFieldChange(token);
        this.selected =10;
    }

    @FXML
    void Clicked11(MouseEvent event) {
        removeStyle();
        pane11.setStyle(style);
        List<String> token = this.LobyData.getoken(11);
        TextFieldChange(token);
        this.selected =11;
    }

    @FXML
    void Clicked12(MouseEvent event) {
        removeStyle();
        pane12.setStyle(style);
        List<String> token = this.LobyData.getoken(12);
        TextFieldChange(token);
        this.selected =12;
    }

    @FXML
    void Clicked13(MouseEvent event) {
        removeStyle();
        pane13.setStyle(style);
        List<String> token = this.LobyData.getoken(13);
        TextFieldChange(token);
        this.selected =13;
    }

    public void removeStyle(){
        this.LobyData = Save.charger();
        pane1.setStyle(stylenull);
        pane2.setStyle(stylenull);
        pane3.setStyle(stylenull);
        pane4.setStyle(stylenull);
        pane5.setStyle(stylenull);
        pane6.setStyle(stylenull);
        pane7.setStyle(stylenull);
        pane8.setStyle(stylenull);
        pane9.setStyle(stylenull);
        pane10.setStyle(stylenull);
        pane11.setStyle(stylenull);
        pane12.setStyle(stylenull);
        pane13.setStyle(stylenull);
    }

    public void TextFieldChange(List<String> l){
        this.TextField_Label.setText(l.get(0));
        this.TextField_URL.setText(l.get(1));
        this.TextField_Class.setText(l.get(2));
    }
}