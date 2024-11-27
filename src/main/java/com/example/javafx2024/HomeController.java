package com.example.javafx2024;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

import javax.swing.*;

public class HomeController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView homeImageButton;

    @FXML
    void initialize() {
        homeImageButton.setOnMouseClicked(event -> {
            JOptionPane.showMessageDialog(null, "Hello world!");
        });
    }

}
