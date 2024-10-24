import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class FXBookQuote extends Application
{
   public void start(Stage stage)
   {
      Pane root = new Pane();
      Scene scene = new Scene(root, 400, 400);
      Label label1 = new Label("Quote1");
      label1.relocate(80, 80);
      Label label2 = new Label("Quote2");
      label2.relocate(80, 120);
      label2.setVisible(false);
      root.getChildren().addAll(label1, label2);
      Button button = new Button("Click me.");
      button.relocate(190, 190);
      button.setOnAction(e -> label2.setVisible(true));
      stage.setScene(scene);
      stage.setTitle("FX Book Quote");
      stage.show(); 
   }
}