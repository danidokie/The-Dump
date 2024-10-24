import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
//Problem 4
public class FXFacts extends Application
{
   int labelNum;
   public void start(Stage stage)
   {
      labelNum = 0;
      Label[] labels = {new Label("F1"), new Label("F2"), new Label("F3"),
         new Label("F4"), new Label("F5"), new Label("F6")};
      BorderPane root = new BorderPane();
      Scene scene = new Scene(root, 300, 500);
      Button button = new Button("Click me.");
      root.setBottom(button);
      root.setCenter(labels[0]);
      button.setOnAction(e -> root.setCenter(labels[++labelNum % 6]));
      stage.setScene(scene);
      stage.setTitle("FX Facts");
      stage.show();
   }
}