package lk.ijsc.dep.court.controler;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class PaymentsFormControler {
    public ImageView imgHome;
    public TableView tablePayment;
    public TextField txtPID;
    public TextField txtHours;

    public void imgHomeOnAction(MouseEvent mouseEvent) throws IOException {
        Parent root= FXMLLoader.load(this.getClass().getResource("/lk/ijsc/dep/court/view/HomeForm.fxml"));
        Scene mainControler=new Scene(root);
        Stage primary=(Stage)imgHome.getScene().getWindow();
        primary.setScene(mainControler);
    }
}
