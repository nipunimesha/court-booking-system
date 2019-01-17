package lk.ijsc.dep.court.controler;

import com.jfoenix.controls.JFXTimePicker;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class NewReservationFormControler {
    public Button btnNext;
    public ImageView imgHome;
    public Button btnSearch;
    public DatePicker pickerDate;
    public TableView tableBooking;
    public ComboBox coboSelectCourt;
    public JFXTimePicker pickerTime;
    public TextField txtBID;

    public void btnNextOnAction(ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(this.getClass().getResource("/lk/ijsc/dep/court/view/PaymentsForm.fxml"));
        Scene mainControler=new Scene(root);
        Stage primary=(Stage)btnNext.getScene().getWindow();
        primary.setScene(mainControler);
    }

    public void imgHomeOnAction(MouseEvent mouseEvent) throws IOException {
        Parent root= FXMLLoader.load(this.getClass().getResource("/lk/ijsc/dep/court/view/HomeForm.fxml"));
        Scene mainControler=new Scene(root);
        Stage primary=(Stage)btnNext.getScene().getWindow();
        primary.setScene(mainControler);

    }

    public void btnSearchOnAction(ActionEvent actionEvent) {
    }
}
