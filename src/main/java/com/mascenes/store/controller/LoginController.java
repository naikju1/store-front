package com.mascenes.store.controller;


//import com.sun.org.omg.CORBA.Initializer;
import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
//import javafx.stage.Stage;
import javafx.event.ActionEvent;
import org.springframework.stereotype.Component;

//import java.awt.*;
//import java.net.URL;
//import java.util.ResourceBundle;

@Component
public class LoginController {

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




    public void loginButtonOnAction(ActionEvent event)
    {
        loginmsg.setText("User "+ this.usernametxt.getText()+" trying to log in");
        loginmsg.setVisible(true);
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

