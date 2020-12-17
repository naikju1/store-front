package com.mascenes.store.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.springframework.stereotype.Component;

@Component
public class AdminController {

    @FXML
    private Button cancelbtn;
    @FXML
    private Button loginbtn;
    @FXML
    private TextField usernametxt;
    @FXML
    private PasswordField passwordtxt;

    @FXML
    private Label loginmsg;



    public void loginButtonOnAction()
    {
        loginmsg.setText("You try to log in");
    }
    public void cancelButtonOnAction(ActionEvent event)
    {
        this.usernametxt.setText("");
        this.passwordtxt.clear();
        /*
        Stage stage=(Stage) cancelbtn.getScene().getWindow();
        stage.close();
        */
    }


}
