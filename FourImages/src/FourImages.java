import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FourImages extends Application {
    public void start(Stage primaryStage) {
        // Create pane
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(15, 12.5, 15, 12.5));
        pane.setHgap(5);
        pane.setVgap(5);

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

        // Add children to pane
        pane.add(image1, 0 ,0);
        pane.add(image2, 0, 1);
        pane.add(image3, 1, 0);
        pane.add(image4, 1, 1);

        // Set scene and stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Four flags");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}
