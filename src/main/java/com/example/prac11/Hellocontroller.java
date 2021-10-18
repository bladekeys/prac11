package com.example.prac11;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class Hellocontroller {
    @FXML
    public Pane calc;

    @FXML
    private Label outcalculator;

    @FXML
    private TextField entercalculator;

    @FXML
    private double getText() {
        double number= Double.parseDouble(entercalculator.getText());
        return number;
    }

    private double a;
    private double b;
    private String button_Text;

    private String calculation(){
        switch (button_Text)
        {
            case "+":
                return String.valueOf(a + b);
            case "-":
                return String.valueOf(a - b);
            case "*":
                return String.valueOf(a * b);
            case "/":
                if (b == 0)
                    throw new
                            UnsupportedOperationException("Cannot divide by zero");
                return String.valueOf(a / b);
        }
        return "Cannot divide by zero";
    }
    public void onMouseClick(MouseEvent mouseEvent){
        Button button = (Button) mouseEvent.getSource();
        String buttonText = button.getText();
        System.out.println(buttonText);
        switch (buttonText) {
            case "+":
            case "-":
            case "/":
            case "*": {
                button_Text=buttonText;
                a = getText();
                entercalculator.setText("");
            }
            case "=":{
                b = getText();
                entercalculator.setText("");
                outcalculator.setText(calculation());
            }

        }
    }

}