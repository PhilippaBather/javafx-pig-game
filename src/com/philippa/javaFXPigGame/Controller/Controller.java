package com.philippa.javaFXPigGame.Controller;

import javafx.application.Platform;
import javafx.fxml.FXML;

public class Controller {

    @FXML
    public void handleExit() {
        Platform.exit();
    }
}
