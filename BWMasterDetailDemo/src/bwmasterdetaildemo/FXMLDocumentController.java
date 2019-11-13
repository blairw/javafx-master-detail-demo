/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bwmasterdetaildemo;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 *
 * @author blair
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private ListView<ContactPerson> myMasterSideMenu;

    @FXML
    private Label lblPersonName;
    
    @FXML
    private TextField txtEmailAddress;
    
    @FXML
    private void userDidClickSidebar() {
        ContactPerson selectedPerson = myMasterSideMenu.getSelectionModel().getSelectedItem();
        lblPersonName.setText(selectedPerson.getName());
        txtEmailAddress.setText(selectedPerson.getEmailAddress());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        List<ContactPerson> myContacts = new ArrayList<ContactPerson>();
        myContacts.add(new ContactPerson("Yenni Tim", "yenni.tim@unsw.edu.au", "123"));
        myContacts.add(new ContactPerson("Phoebe Zhou", "phoebe.zhou1@unsw.edu.au", "098"));
        myContacts.add(new ContactPerson("Kathy Xu", "kathy.xu@unsw.edu.au", "765"));
        myContacts.add(new ContactPerson("Blair Wang", "blair.wang@unsw.edu.au", "456"));
        myContacts.add(new ContactPerson("Jacob Meyerowitz", "j.meyerowitz@unsw.edu.au", "789"));
        
        for (ContactPerson x : myContacts) {
            myMasterSideMenu.getItems().add(x);
        }
    }    
    
}
