package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    @FXML
    private ComboBox<String> cbSearchOptions;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cbSearchOptions.getItems().addAll(
                "Select one...",
                "Course Number",
                "Semester",
                "Course"
        );
        cbSearchOptions.setValue("Select one...");
    }
}
