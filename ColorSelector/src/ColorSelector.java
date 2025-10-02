import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ColorSelector extends Application {
    public void start(Stage primaryStage) {
        // Create panes
        Pane bigPane = new VBox();
        StackPane textPane = new StackPane();
        textPane.setAlignment(Pos.CENTER);
        GridPane sliders = new GridPane();
        bigPane.setPadding(new Insets(15, 12.5, 15, 12.5));
        sliders.setPadding(new Insets(15, 12.5, 15, 12.5));
        
        // Make label and add it to pane
        Text label = new Text(20, 20, "Your color");
        label.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
        textPane.getChildren().add(label);
        bigPane.getChildren().add(textPane);
        
        // Make sliders and their labels
        Slider red = new Slider(0, 1, 0);
        Slider green = new Slider(0, 1, 0);
        Slider blue = new Slider(0, 1, 0);
        Slider alpha = new Slider(0, 1, 1);
        red.valueProperty().addListener(e -> label.setFill(new Color(red.getValue(), green.getValue(), blue.getValue(), alpha.getValue())));
        green.valueProperty().addListener(e -> label.setFill(new Color(red.getValue(), green.getValue(), blue.getValue(), alpha.getValue())));
        blue.valueProperty().addListener(e -> label.setFill(new Color(red.getValue(), green.getValue(), blue.getValue(), alpha.getValue())));
        alpha.valueProperty().addListener(e -> label.setFill(new Color(red.getValue(), green.getValue(), blue.getValue(), alpha.getValue())));
        Label redLabel = new Label("Red");
        Label greenLabel = new Label("Green");
        Label blueLabel = new Label("Blue");
        Label alphaLabel = new Label("Alpha");
        
        // Add sliders to pane and pane to big pane
        sliders.add(redLabel, 0, 0);
        sliders.add(red, 1, 0);
        sliders.add(greenLabel, 0, 1);
        sliders.add(green, 1, 1);
        sliders.add(blueLabel, 0, 2);
        sliders.add(blue, 1, 2);
        sliders.add(alphaLabel, 0, 3);
        sliders.add(alpha, 1, 3);
        bigPane.getChildren().add(sliders);
        

        // Set scene and stage
        Scene scene = new Scene(bigPane);
        primaryStage.setTitle("Pick a color");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}
