package sample;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.concurrent.ScheduledService;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ResourceBundle;

public class ControllerView implements Initializable {

    private boolean MainViewVisible = false;
    private ThService t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;
    private int refreshtime;

    @FXML
    private Text Time;

    @FXML
    private Pane MainView;
    private Data LobyData;

    @FXML
    private Text Label1, Label2, Label3, Label4, Label5, Label6, Label7, Label8, Label9, Label10, Label11, Label12, Label13;

    @FXML
    private Text Label1a, Label2a, Label3a, Label4a, Label5a, Label6a, Label7a, Label8a, Label9a, Label10a, Label11a, Label12a, Label13a;

    @FXML
    private Text R1, R5, R10, R30, R60, R120;

    @FXML
    public void ButtonClicked(MouseEvent event) throws IOException {
        if(MainViewVisible == false){
            MainView.setVisible(true);
            MainViewVisible = true;
            refresh();
        }else{
            MainView.setVisible(false);
            MainViewVisible = false;
            stop();
        }

    }

    @FXML
    void Closed(MouseEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    void R10c(MouseEvent event) {
        this.refreshtime = 10;
        colorRefresh();
        this.R10.setFill(Color.LIGHTBLUE);
    }

    @FXML
    void R120c(MouseEvent event) {
        this.refreshtime = 120;
        colorRefresh();
        this.R120.setFill(Color.LIGHTBLUE);
    }

    @FXML
    void R1c(MouseEvent event) {
        this.refreshtime = 1;
        colorRefresh();
        this.R1.setFill(Color.LIGHTBLUE);
    }

    @FXML
    void R30c(MouseEvent event) {
        this.refreshtime = 30;
        colorRefresh();
        this.R30.setFill(Color.LIGHTBLUE);
    }

    @FXML
    void R5c(MouseEvent event) {
        this.refreshtime = 5;
        colorRefresh();
        this.R5.setFill(Color.LIGHTBLUE);
    }

    @FXML
    void R60c(MouseEvent event) {
        this.refreshtime = 60;
        colorRefresh();
        this.R60.setFill(Color.LIGHTBLUE);
    }

    @FXML
    void AddClicked(MouseEvent event) throws IOException {
        Pane pane = FXMLLoader.load(getClass().getResource("AddView.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(pane);
        scene.setFill(Color.TRANSPARENT);
        stage.setScene(scene);
        stage.initStyle(StageStyle.UTILITY);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.initStyle(StageStyle.TRANSPARENT);
        Rectangle2D screenBounds = Screen.getPrimary().getBounds();
        stage.setX(screenBounds.getMaxX()-650);
        stage.setY(399);
        stage.show();
    }

    @FXML
    void EditClicked(MouseEvent event) throws IOException {
        Pane pane = FXMLLoader.load(getClass().getResource("EditView.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(pane);
        scene.setFill(Color.TRANSPARENT);
        stage.setScene(scene);
        stage.initStyle(StageStyle.UTILITY);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.initStyle(StageStyle.TRANSPARENT);
        Rectangle2D screenBounds = Screen.getPrimary().getBounds();
        stage.setX(screenBounds.getMaxX()-650);
        stage.setY(399);
        stage.show();
    }

    public void Clock(){
        Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            Time.setText(LocalDateTime.now().format(formatter));
        }), new KeyFrame(Duration.seconds(1)));
        clock.setCycleCount(Animation.INDEFINITE);
        clock.play();
    }

    public void init(){
        for(int i =1;i<this.LobyData.getsize();i++) {
            List<String> res = this.LobyData.getoken(i);
            if(!res.get(1).equals("null")) {
                switch (i) {
                    case 1 -> {
                        this.t1 = new ThService(res.get(1),res.get(2),this.Label1);
                        this.Label1a.setText(res.get(0));
                        this.t1.setPeriod(Duration.seconds(this.refreshtime));
                        this.t1.start();
                    }
                    case 2 -> {
                        this.t2 = new ThService(res.get(1),res.get(2),this.Label2);
                        this.Label2a.setText(res.get(0));
                        this.t2.setPeriod(Duration.seconds(this.refreshtime));
                        this.t2.start();
                    }
                    case 3 -> {
                        this.t3 = new ThService(res.get(1),res.get(2),this.Label3);
                        this.Label3a.setText(res.get(0));
                        this.t3.setPeriod(Duration.seconds(this.refreshtime));
                        this.t3.start();
                    }
                    case 4 -> {
                        this.t4 = new ThService(res.get(1),res.get(2),this.Label4);
                        this.Label4a.setText(res.get(0));
                        this.t4.setPeriod(Duration.seconds(this.refreshtime));
                        this.t4.start();
                    }
                    case 5 -> {
                        this.t5 = new ThService(res.get(1),res.get(2),this.Label5);
                        this.Label5a.setText(res.get(0));
                        this.t5.setPeriod(Duration.seconds(this.refreshtime));
                        this.t5.start();
                    }
                    case 6 -> {
                        this.t6 = new ThService(res.get(1),res.get(2),this.Label6);
                        this.Label6a.setText(res.get(0));
                        this.t6.setPeriod(Duration.seconds(this.refreshtime));
                        this.t6.start();
                    }
                    case 7 -> {
                        this.t7 = new ThService(res.get(1),res.get(2),this.Label7);
                        this.Label7a.setText(res.get(0));
                        this.t7.setPeriod(Duration.seconds(this.refreshtime));
                        this.t7.start();
                    }
                    case 8 -> {
                        this.t8 = new ThService(res.get(1),res.get(2),this.Label8);
                        this.Label8a.setText(res.get(0));
                        this.t8.setPeriod(Duration.seconds(this.refreshtime));
                        this.t8.start();
                    }
                    case 9 -> {
                        this.t9 = new ThService(res.get(1),res.get(2),this.Label9);
                        this.Label9a.setText(res.get(0));
                        this.t9.setPeriod(Duration.seconds(this.refreshtime));
                        this.t9.start();
                    }
                    case 10 -> {
                        this.t10 = new ThService(res.get(1),res.get(2),this.Label10);
                        this.Label10a.setText(res.get(0));
                        this.t10.setPeriod(Duration.seconds(this.refreshtime));
                        this.t10.start();
                    }
                    case 11 -> {
                        this.t11 = new ThService(res.get(1),res.get(2),this.Label11);
                        this.Label11a.setText(res.get(0));
                        this.t11.setPeriod(Duration.seconds(this.refreshtime));
                        this.t11.start();
                    }
                    case 12 -> {
                        this.t12 = new ThService(res.get(1),res.get(2),this.Label12);
                        this.Label12a.setText(res.get(0));
                        this.t12.setPeriod(Duration.seconds(this.refreshtime));
                        this.t12.start();
                    }
                    case 13 -> {
                        this.t13 = new ThService(res.get(1),res.get(2),this.Label13);
                        this.Label13a.setText(res.get(0));
                        this.t13.setPeriod(Duration.seconds(this.refreshtime));
                        this.t13.start();
                    }
                }
            }
        }
    }

    private static class ThService extends ScheduledService<Void> {
        private String url, div;
        private Text Label;

        public ThService(String url, String div, Text label) {
            this.url = url;
            this.div = div;
            this.Label = label;
        }

        protected Task<Void> createTask() {
            return new Task<Void>() {
                protected Void call() throws IOException {
                    try {
                        WebScrap search = new WebScrap(url, div);
                        String searchRes = search.Scrap();
                        Label.setText(searchRes);
                        } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return null;
                }
            };
        }
    }

    public void check(){
        for(int i =1;i<this.LobyData.getsize();i++) {
            List<String> res = this.LobyData.getoken(i);
            System.out.println(res);
        }
    }

    public void refresh() throws NullPointerException{
        this.LobyData = Save.charger();
        init();
    }

    public void stop(){
        if(this.t1 != null && this.t1.isRunning()){
            this.t1.cancel();
        }
        if(this.t2 != null && this.t2.isRunning()){
            this.t2.cancel();
        }
        if(this.t3 != null && this.t3.isRunning()){
            this.t3.cancel();
        }
        if(this.t4 != null && this.t4.isRunning()){
            this.t4.cancel();
        }
        if(this.t5 != null && this.t5.isRunning()){
            this.t5.cancel();
        }
        if(this.t6 != null && this.t6.isRunning()){
            this.t6.cancel();
        }
        if(this.t7 != null && this.t7.isRunning()){
            this.t7.cancel();
        }
        if(this.t8 != null && this.t8.isRunning()){
            this.t8.cancel();
        }
        if(this.t9 != null && this.t9.isRunning()){
            this.t9.cancel();
        }
        if(this.t10 != null && this.t10.isRunning()){
            this.t10.cancel();
        }
        if(this.t11 != null && this.t11.isRunning()){
            this.t11.cancel();
        }
        if(this.t12 != null && this.t12.isRunning()){
            this.t12.cancel();
        }
        if(this.t13 != null && this.t13.isRunning()){
            this.t13.cancel();
        }
    }

    public void colorRefresh(){
        this.R1.setFill(Color.WHITE);
        this.R5.setFill(Color.WHITE);
        this.R10.setFill(Color.WHITE);
        this.R30.setFill(Color.WHITE);
        this.R60.setFill(Color.WHITE);
        this.R120.setFill(Color.WHITE);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        MainView.setVisible(false);
        this.R10.setFill(Color.LIGHTBLUE);
        this.refreshtime = 10;
        Clock();
        this.LobyData = Save.charger();
        //check();
        init();
    }
}
