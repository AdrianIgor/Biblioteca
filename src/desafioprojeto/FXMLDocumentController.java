/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package desafioprojeto;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import desafioprojeto2.DesafioProjeto2;
import desafioprojeto3.DesafioProjeto3;
import java.io.IOException;
import javafx.stage.Stage;

/**
 *
 * @author unity
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Hyperlink cadastro;

    @FXML
    private Button login;

    @FXML
    private TextField nomeField;

    @FXML
    private PasswordField senhaField;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        new DesafioProjeto2().start(stage);
    }
    
    @FXML
    void logon(ActionEvent event) throws IOException{
        Stage stage = new Stage();
        new DesafioProjeto3().start(stage);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
