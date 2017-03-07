package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

public class Controller {
    @FXML
    private ComboBox cbSearchOptions;

    private ObservableList<String> options = FXCollections.observableArrayList(
            "Course Number",
            "Semester",
            "Course Lead"
    );

    

    void initialize(){

    }
}
