package com.mascenes.store;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StoreApplication extends Application {
    private ConfigurableApplicationContext springContext;
    private Parent rootNode;
    public static void main(String[] args) {
        Application.launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        stage.setScene(new Scene(rootNode, 500, 500));
        stage.setTitle("Ma Scenes inc.");
        stage.setMinWidth(500);
        stage.setMinHeight(500);
        stage.show();
    }
    public void init() throws  Exception{
        springContext = SpringApplication.run(StoreApplication.class);
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/login.fxml"));
        fxmlLoader.setControllerFactory(springContext::getBean);
        rootNode = fxmlLoader.load();
    }
    public void stop() throws Exception{
        springContext.close();
    }

}