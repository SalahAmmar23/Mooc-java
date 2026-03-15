package myFirstApplication;


import javafx.application.Application;
import javafx.stage.Stage;
public class MyFirstApplication extends Application {
    

    
    @Override
    public void start(Stage stage) {
        stage.setTitle("My first application"); // set window title
        stage.show(); // show the window
    }

    public static void main(String[] args) {
        launch(); // start JavaFX
    }
    

}
