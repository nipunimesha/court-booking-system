package lk.ijsc.dep.court.controler;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import lk.ijsc.dep.court.BO.BOFactory;
import lk.ijsc.dep.court.BO.custom.ManageCourtBO;
import lk.ijsc.dep.court.dto.CourtDTO;

import javax.swing.*;
import java.io.IOException;

public class CourtManageFormControler {
    public ImageView imgHome;
    public Button btnSave;
    public Button btnUpdate;
    public Button btnDelete;
    public TextField txtCID;
    public TextField txtCourtName;
    public TextField txtTown;
    public TableView tableCourt;

    ManageCourtBO manageCourtBO= (ManageCourtBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.COURTBO);

    public void imgHomeOnAction(MouseEvent mouseEvent) throws IOException {
        Parent root= FXMLLoader.load(this.getClass().getResource("/lk/ijsc/dep/court/view/HomeForm.fxml"));
        Scene mainControler=new Scene(root);
        Stage primary=(Stage)imgHome.getScene().getWindow();
        primary.setScene(mainControler);
    }

    public void btnSaveOnAction(ActionEvent actionEvent) throws Exception {

        if(txtCID.getText().trim()==null){
            return;
        }
        if(txtCourtName.getText().trim()==null){
            return;
        }
        if(txtTown.getText().trim()==null){
            return;
        }
        int cid=Integer.parseInt(txtCID.getText());
        String town=txtTown.getText();
        String name=txtCourtName.getText();

        CourtDTO courtDTO=new CourtDTO(cid,town,name);
        boolean result=manageCourtBO.saveCourt(courtDTO);
        if (!result){
            Alert alert=new Alert(Alert.AlertType.WARNING,"Please try again" , ButtonType.OK);
            alert.show();
        }else{
            Alert alert1=new Alert(Alert.AlertType.WARNING,"Court has been successfully saved." ,ButtonType.OK);
            alert1.show();
            txtTown.clear();
            txtCourtName.clear();
            txtCID.clear();


        }



    }

    public void btnUpadateOnAction(ActionEvent actionEvent) {
    }

    public void btnDeleteOnAction(ActionEvent actionEvent) {
    }
}
