package buttonandlabel;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox; // vertical layout
import javafx.stage.Stage;

public class ButtonAndLabelApplication extends Application {


    @Override
    public void start(Stage stage) {
        Label label = new Label("Press the button:");
        Button button = new Button("Click me");

        // VBox puts elements vertically (Label above Button)
        VBox layout = new VBox(10); // 10 px spacing
        layout.getChildren().addAll(label, button);

        Scene scene = new Scene(layout, 200, 100);
        stage.setTitle("Button and Label Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
