import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;

public class FXConverter extends Application
{
   public void start(Stage stage)
   {
      Pane root = new Pane();
      Scene scene = new Scene(root, 400, 400);
      Label label1 = new Label("Miles");
      label1.relocate(80, 80);
      Label label2 = new Label("Feet");
      label2.relocate(90, 120);
      Button button = new Button("Click me.");
      button.relocate(190, 190);
      TextField milesField = new TextField();
      TextField feetField = new TextField();
      milesField.relocate(120, 80);
      feetField.relocate(120, 120);
      button.setOnAction(e -> calculateFeet(milesField, feetField));
      milesField.setOnAction(e -> calculateFeet(milesField, feetField));
      root.getChildren().addAll(label1, label2, button, milesField, feetField);
      stage.setTitle("FXConverter");
      stage.setScene(scene);
      stage.show();
   }
   
   private void calculateFeet(TextField milesField, TextField feetField)
   {
      String milesString= milesField.getText();
      double miles = 0;
      try //if input isnt nums
      {
         miles = Double.parseDouble(milesString);
      }
      catch(NumberFormatException e)
      {
         Alert alert = new Alert(AlertType.WARNING);
         alert.setHeaderText("Error!");
         alert.setContentText(String.format("You entered %s which is not a number.", milesString));
         alert.showAndWait();
         milesField.setText("");
         return;
      }
      double feet = 5200 * miles;
         feetField.setText(String.format("%,.2,", feet));
   }
}