package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TitledPane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    @FXML
    private ComboBox<String> cbSearchOptions;

    @FXML
    private Tab homeTab;

    @FXML
    private Tab searchTab;

    @FXML
    private Tab loginTab;

    @FXML
    private TitledPane tpSearchResults;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        homeTab.setGraphic(new Label("Home"));
        searchTab.setGraphic(new Label("Search"));
        loginTab.setGraphic(new Label("Login"));

        //debug
        tpSearchResults.setVisible(false);

        cbSearchOptions.getItems().addAll(
                "Select one...",
                "Course Number",
                "Semester",
                "Course"
        );
        cbSearchOptions.setValue("Select one...");
    }
}
