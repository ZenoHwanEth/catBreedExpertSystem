package sample;

import com.github.cschen1205.ess.engine.EqualsClause;
import com.github.cschen1205.ess.engine.RuleInferenceEngine;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private ComboBox<String> SheddingCombo,HealthCombo,PlayfulCombo,VocalizeCombo,FriendCombo,GroomCombo;

    @FXML
    private ObservableList<String> list1 = FXCollections.observableArrayList("Low","Medium","High");
    private ObservableList<String> list2 = FXCollections.observableArrayList("Yes","No");

    @FXML
    private Label catLabel;
    @FXML
    private Label errorMessage1,errorMessage2,errorMessage3,errorMessage4,errorMessage5,errorMessage6;

    @FXML
    private Button lbutton,rbutton;

    @FXML
    private ImageView imageView;
    private Image images[];
    private String [] catName;
    private String [] fileAddress;
    private List<String> list = new ArrayList<String>();
    int j = 0;


    @FXML
    private void handleButtonAction(ActionEvent event)
    {
        j=0;
        catName = null;
        fileAddress = null;
        list.clear();
        images=null;
        if(SheddingCombo.getValue()!=null&&HealthCombo.getValue()!=null&&PlayfulCombo.getValue()!=null&&VocalizeCombo.getValue()!=null&&FriendCombo.getValue()!=null&&GroomCombo.getValue()!=null){
            //check the knowledge base that match the criteria
            RuleInferenceEngine rie= InferenceEng.getInferenceEngine();
            rie.addFact(new EqualsClause("shedding", SheddingCombo.getValue().toLowerCase()));
            rie.addFact(new EqualsClause("prone to health problem", HealthCombo.getValue().toLowerCase()));
            rie.addFact(new EqualsClause("Playfulness", PlayfulCombo.getValue().toLowerCase()));
            rie.addFact(new EqualsClause("Tendency to vocalize", VocalizeCombo.getValue().toLowerCase()));
            rie.addFact(new EqualsClause("Friendly", FriendCombo.getValue().toLowerCase()));
            rie.addFact(new EqualsClause("Easy to groom", GroomCombo.getValue().toLowerCase()));
            rie.infer();//forward chain
            if(rie.getFacts().size()==7)//check if the cat breed is in the knowledge base or not
            {
                fileAddress = rie.getFacts().get(6).getValue().split(",");
                catName = rie.getFacts().get(6).getVariable().split(",");
                if(fileAddress.length>1) {
                    for (int i = 0; i < fileAddress.length; i++) {
                        list.add(fileAddress[i]);
                    }
                    catLabel.setText(catName[j]);

                    images = new Image[list.size()];
                    for (int i = 0; i < list.size(); i++) {
                        images[i] = new Image(list.get(i));

                    }
                    imageView.setImage(images[j]);
                    imageView.setCursor(Cursor.CLOSED_HAND);
                    lbutton.setDisable(false);
                    rbutton.setDisable(false);
                }else{
                    imageView.setImage(new Image(rie.getFacts().get(6).getValue()));
                    catLabel.setText(catName[j]);
                    lbutton.setDisable(true);
                    rbutton.setDisable(true);
                }
            }
            else{
                catLabel.setText("Data not collected or found in the Knowledge Base");
                imageView.setImage(new Image("/CatPic/notfound.jpg"));
                lbutton.setDisable(true);
                rbutton.setDisable(true);
            }
        }else {

            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setHeaderText("Input not valid");
            errorAlert.setContentText("PLEASE FILL IN ALL THE COMBO BOXES");
            errorAlert.showAndWait();
        }
        errorDepiction();
    }

    @FXML
    private void setrButton(ActionEvent event){
        j = j + 1;
        if (j == list.size()) {
            j = 0;
        }
        catLabel.setText(catName[j]);
        imageView.setImage(images[j]);
    }
    @FXML
    private void setLbutton(ActionEvent event){
        j = j - 1;
        if ( j == -1) {
            j = list.size() - 1;
        }
        catLabel.setText(catName[j]);
        imageView.setImage(images[j]);
    }


    public void initialize(URL location, ResourceBundle resources) {
        SheddingCombo.setItems(list1);
        HealthCombo.setItems(list2);
        PlayfulCombo.setItems(list1);
        VocalizeCombo.setItems(list1);
        FriendCombo.setItems(list2);
        GroomCombo.setItems(list2);
    }



    public void errorDepiction()
    {
        if(SheddingCombo.getValue()==null)
        {
            errorMessage1.setText("Select your choice PLS");
        }
        else{
            errorMessage1.setText("");
        }
        if(HealthCombo.getValue()==null)
        {
            errorMessage2.setText("Select your choice PLS");
        }
        else{
            errorMessage2.setText("");
        }
        if(PlayfulCombo.getValue()==null)
        {
            errorMessage3.setText("Select your choice PLS");
        }
        else{
            errorMessage3.setText("");
        }
        if(VocalizeCombo.getValue()==null)
        {
            errorMessage4.setText("Select your choice PLS");
        }
        else{
            errorMessage4.setText("");
        }
        if(FriendCombo.getValue()==null)
        {
            errorMessage5.setText("Select your choice PLS");
        }
        else{
            errorMessage5.setText("");
        }
        if(GroomCombo.getValue()==null)
        {
            errorMessage6.setText("Select your choice PLS");
        }
        else{
            errorMessage6.setText("");
        }
    }

}
