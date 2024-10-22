import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.scene.text.Text;

public class MoveText extends Application
{
   public void start(Stage stage)
   {
      BorderPane root = new BorderPane();
      Scene scene = new Scene(root, 500, 300);
      HBox hbox = new HBox(10);
      Button left = new Button("L");
      Button right = new Button("R");
      hbox.getChildren().addAll(left, right);
      root.setBottom(hbox);
      hbox.setAlignment(Pos.CENTER);
      BorderPane.setAlignment(hbox, Pos.CENTER);
      Pane pane = new Pane();
      Text text = new Text("Some text!!");
      left.setOnAction(e -> text.setX(text.getX() - 3));
      right.setOnAction(e -> moveRight(e, text));
      pane.getChildren().add(text);
      text.relocate(200, 120);
      root.setCenter(pane);
      stage.setScene(scene);
      stage.setTitle("Move text");
      stage.show();
   }
   
   public static void moveRight(ActionEvent e, Text text)
   {
      System.out.println("Right button pressed.");
      text.setX(text.getX() + 3);
   }
}