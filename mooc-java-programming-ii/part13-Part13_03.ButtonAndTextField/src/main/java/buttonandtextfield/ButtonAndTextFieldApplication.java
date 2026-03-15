package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox; // vertical layout
import javafx.stage.Stage;

public class ButtonAndTextFieldApplication extends Application {


@Override
    public void start(Stage stage) {
        // Create the controls
        Button button = new Button("Click me");
        TextField textField = new TextField();

        // VBox layout places button above the text field
        VBox layout = new VBox(10); // 10 px spacing
        layout.getChildren().addAll(button, textField);

        // Set up the scene and stage
        Scene scene = new Scene(layout, 250, 100);
        stage.setTitle("Button and TextField Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
