import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class CircleWindow extends Application {
    public void start(Stage primaryStage) {
        // Create pane
        Pane pane = new Pane();
        pane.setPadding(new Insets(15, 12.5, 15, 12.5));

        // Create circle
        Circle circle = new Circle(100, 100, 50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
        circle.setOnMousePressed(e -> {circle.setFill(Color.BLACK);});
        circle.setOnMouseReleased(e -> {circle.setFill(Color.WHITE);});

        // Add circle to pane
        pane.getChildren().add(circle);

        // Set scene and stage
        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("Circle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}
