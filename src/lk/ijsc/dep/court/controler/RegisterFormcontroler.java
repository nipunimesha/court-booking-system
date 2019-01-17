package lk.ijsc.dep.court.controler;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import lk.ijsc.dep.court.BO.BOFactory;
import lk.ijsc.dep.court.BO.custom.ManagePlayerBO;
import lk.ijsc.dep.court.dto.PlayerDTO;

import java.io.IOException;

public class RegisterFormcontroler {




    public ImageView imgHome;
    public Button btnSave;
    public Button btnUpdate;
    public Button btnDelete;
    public TextField txtNIC;
    public TextField txtName;
    public TextField txtContactNo;
    public TextField txtAddress;
    public Button btnSearch;

    ManagePlayerBO managePlayerBO= (ManagePlayerBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.PLAYERBO);

    public void imgHomeOnClickOnAction(MouseEvent mouseEvent) throws IOException {
        Parent root=FXMLLoader.load(this.getClass().getResource("/lk/ijsc/dep/court/view/HomeForm.fxml"));
        Scene mainControler=new Scene(root);
        Stage primary=(Stage)imgHome.getScene().getWindow();
        primary.setScene(mainControler);
    }

    public void btnsaveOnAction(ActionEvent actionEvent) throws Exception {
        int nic= Integer.parseInt(txtNIC.getText());
        String name=txtName.getText();
        int contact=Integer.parseInt(txtContactNo.getText());
        String address=txtAddress.getText();
        PlayerDTO playerDTO = new PlayerDTO(nic,name,address,contact);
        boolean result=managePlayerBO.savePlayer(playerDTO);


        if (!result){
            Alert alert=new Alert(Alert.AlertType.WARNING,"Please try again" ,ButtonType.OK);
            alert.show();
        }else{
            Alert alert1=new Alert(Alert.AlertType.WARNING,"Player has been successfully saved." ,ButtonType.OK);
            alert1.show();
            txtNIC.setText("");
            txtAddress.setText("");
            txtContactNo.setText("");
            txtName.setText("");
        }
    }

    public void btnUpdateOnAction(ActionEvent actionEvent) {

    }

    public void btnDeleteOnAction(ActionEvent actionEvent) throws Exception {
        int id = Integer.parseInt(txtNIC.getText());
         boolean result = managePlayerBO.deletePlayer(id);
         if(result){
             Alert alert1=new Alert(Alert.AlertType.WARNING,"Player has been successfully deleted." ,ButtonType.OK);
             alert1.show();
             txtNIC.setText("");
         }else{
             Alert alert=new Alert(Alert.AlertType.WARNING,"Please try again" ,ButtonType.OK);
             alert.show();
        }
    }

    public void btnSearchOnAction(ActionEvent actionEvent) throws Exception {

        
        int id = Integer.parseInt(txtNIC.getText());
        PlayerDTO p = managePlayerBO.find(id);
        if(p.getNic() == 0){
            Alert alert=new Alert(Alert.AlertType.WARNING,"there is no any user." ,ButtonType.OK);
            alert.show();
        }else{
            txtName.setText(p.getName());
            txtAddress.setText(p.getAddress());
            txtContactNo.setText(p.getContact()+"");
        }
    }
}
