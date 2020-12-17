package com.mascenes.store.controller;


//import com.sun.org.omg.CORBA.Initializer;
import com.mascenes.store.model.Users;
import com.mascenes.store.services.LoginService;
import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
//import javafx.stage.Stage;
import javafx.event.ActionEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//import java.awt.*;
//import java.net.URL;
//import java.util.ResourceBundle;

@Component
public class LoginController {

    @Autowired
    private LoginService loginService;
    private Users sessionUser;


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
        try{


            if(usernametxt.getText() != "" && !passwordtxt.equals(""))
            sessionUser = loginService.userAuthentication(this.usernametxt.getText(),this.passwordtxt.getText());
        }catch (RuntimeException rex){
            loginmsg.setText(rex.getMessage());
            loginmsg.setVisible(true);
        }

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

