import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FourImages extends Application {
    public void start(Stage primaryStage) {
        // Create panes
        Pane bigPane = new HBox(10);
        bigPane.setPadding(new Insets(5, 5, 5, 5));
        Pane pane1 = new VBox(10);
        Pane pane2 = new VBox(10);
        pane1.setPadding(new Insets(5, 5, 5, 5));
        pane2.setPadding(new Insets(5, 5, 5, 5));

        // Create images
        ImageView image1 = new ImageView("images/flag1.gif");
        ImageView image2 = new ImageView("images/flag2.gif");
        ImageView image3 = new ImageView("images/flag6.gif");
        ImageView image4 = new ImageView("images/flag7.gif");

        // Set image dimentions
        image1.setFitHeight(150);
        image1.setFitWidth(250);
        image2.setFitHeight(150);
        image2.setFitWidth(250);
        image3.setFitHeight(150);
        image3.setFitWidth(250);
        image4.setFitHeight(150);
        image4.setFitWidth(250);

        // Add children to panes
        pane1.getChildren().add(image1);
        pane1.getChildren().add(image2);
        pane2.getChildren().add(image3);
        pane2.getChildren().add(image4);
        bigPane.getChildren().add(pane1);
        bigPane.getChildren().add(pane2);

        // Set scene and stage
        Scene scene = new Scene(bigPane);
        primaryStage.setTitle("Four flags");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}
