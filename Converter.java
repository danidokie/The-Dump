import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Converter extends Application
{  
   @Override
   public void start(Stage stage)
   {
      Pane root = new Pane();
      
      Label milesLabel = new Label("Miles");
      Label kmLabel = new Label("Km");
      
      TextField milesField = new TextField();
      TextField kmField = new TextField();
      milesLabel.relocate(100, 100);
      kmLabel.relocate(100, 300);
      milesField.relocate(200, 200);
      kmField.relocate(200, 300);
      milesField.setOnAction(e -> handleMilesField(milesField));
      root.getChildren().addAll(milesLabel, kmLabel, milesField, kmField);
      
      Scene scene = new Scene(root, 500, 400);
      
      stage.setScene(scene);
      stage.setTitle("Miles KM Converter");
      stage.show();
   }
   
   public void handleMilesField(TextField milesField, TextField kmField)
   {
      String milesString = milesField.getText();
      double miles = Double.parseDouble(milesString);
      double km = 1.6 * miles;
      kmField.setText(km);
      milesField.setText("");
   }
}