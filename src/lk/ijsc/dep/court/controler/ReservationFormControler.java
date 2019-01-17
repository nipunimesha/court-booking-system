package lk.ijsc.dep.court.controler;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class ReservationFormControler {

    public Button btnNew;
    public ImageView imgHome;
    public TableView tableBookedCourts;

    public void btnNewOnAction(ActionEvent actionEvent) throws IOException {
        Parent root=FXMLLoader.load(this.getClass().getResource("/lk/ijsc/dep/court/view/NewReservationForm.fxml"));
        Scene mainControler=new Scene(root);
        Stage primary=(Stage)btnNew.getScene().getWindow();
        primary.setScene(mainControler);
    }

    public void imgHomeClickOnAction(MouseEvent mouseEvent) throws IOException {
        Parent root=FXMLLoader.load(this.getClass().getResource("/lk/ijsc/dep/court/view/HomeForm.fxml"));
        Scene mainControler=new Scene(root);
        Stage primary=(Stage)btnNew.getScene().getWindow();
        primary.setScene(mainControler);
    }
}
