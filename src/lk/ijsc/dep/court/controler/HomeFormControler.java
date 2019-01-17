package lk.ijsc.dep.court.controler;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeFormControler {
    public Button btnReservation;
    public Button btnRegister;
    public ImageView imgCourtManeger;
    public ImageView imgRegister;
    public ImageView imgReservation;


    public void imgCourtManageOnAction(MouseEvent mouseEvent) throws IOException {
        Parent root= FXMLLoader.load(this.getClass().getResource("/lk/ijsc/dep/court/view/CourtManageForm.fxml"));
        Scene mainControler=new Scene(root);
        Stage primary=(Stage)imgCourtManeger.getScene().getWindow();
        primary.setScene(mainControler);
    }

    public void imgRegisterOnAction(MouseEvent mouseEvent) throws IOException {
        Parent root= FXMLLoader.load(this.getClass().getResource("/lk/ijsc/dep/court/view/RegisterForm.fxml"));
        Scene mainControler=new Scene(root);
        Stage primary=(Stage)imgCourtManeger.getScene().getWindow();
        primary.setScene(mainControler);
    }

    public void imgReservationOnAction(MouseEvent mouseEvent) throws IOException {
        Parent root= FXMLLoader.load(this.getClass().getResource("/lk/ijsc/dep/court/view/ReservationForm.fxml"));
        Scene mainControler=new Scene(root);
        Stage primary=(Stage)imgCourtManeger.getScene().getWindow();
        primary.setScene(mainControler);
    }
}
