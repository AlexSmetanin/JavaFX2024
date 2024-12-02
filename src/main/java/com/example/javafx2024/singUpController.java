package com.example.javafx2024;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class singUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField countryField;

    @FXML
    private TextField firstNameField;

    @FXML
    private ToggleGroup gender;

    @FXML
    private TextField lastNameField;

    @FXML
    private Button loginButton;

    @FXML
    private TextField loginField;

    @FXML
    private RadioButton manRadioButton;

    @FXML
    private PasswordField passwordField;

    @FXML
    private RadioButton womanRadioButton;

    @FXML
    void initialize() {


    }

}
