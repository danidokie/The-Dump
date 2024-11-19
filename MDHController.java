//settings > compiler settings > workspace
//local files > java jdk
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MDHController
{
   private MDHModel model = new MDHModel();
   @FXML
   private Button button;
   
   @FXML
   private Label daysLabel;
   
   @FXML
   private Label hoursLabel;
   
   @FXML
   private TextField textField;
   
   @FXML
   void handleUserInput(ActionEvent event)
   {
      String minutesString = textField.getText();
      double minutes = 0.0;
      try
      {
         minutes = Double.parseDouble(minutesString);
      }
      catch(NumberFormatException e)
      {
         Alert alert = new Alert(AlertType.WARNING);
         alert.showAndWait();
         return;
      }
      double hours = minutes / 60.0;
      double days = minutes / 1440.0;
      hoursLabel.setText(String.format("%,.2f minutes equals %,.2f hours",
         minutes, hours));
      daysLabel.setText(String.format("%,.2f minutes equals %,.2f days",
         mintes, days));
    }
}