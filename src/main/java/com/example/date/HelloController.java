package com.example.date;


import java.net.URL;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button enterbutton;

    @FXML
    private Label label1;

    @FXML
    private Label label2;

    @FXML
    private TextField textfield;

    @FXML
    void initialize() {

        enterbutton.setOnAction(event -> {
            String text = textfield.getText();
            String [] arr = text.split(" ");

            int month = Integer.parseInt(arr[0]);
            int day = Integer.parseInt(arr[1]);
            int year = Integer.parseInt(arr[2]);

            label2.setVisible(true);

            enterbutton.setVisible(false);
            textfield.setVisible(false);
            label1.setVisible(false);

            label2.setText(getDate(month,day,year));


        });




    }

    public static String getDate(int month, int day, int year) {
        LocalDate localDate = LocalDate.of(year, month, day);
        return localDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH).toUpperCase();


    }

}
