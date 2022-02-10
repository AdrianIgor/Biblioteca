/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package desafioprojeto2;

import desafioprojeto3.DesafioProjeto3;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author unity
 */
public class FXMLDocument2Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private Button botaoCancel;
    
    @FXML
    private Button cadastrar;

    @FXML
    private TextField inputCPF;

    @FXML
    private TextField inputNasc;

    @FXML
    private TextField inputNome;

    @FXML
    private TextField inputRG;

    @FXML
    private TextField inputSaldo;

    @FXML
    private PasswordField inputSenha;

    @FXML
    private PasswordField inputSenha2;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    void cadastroCliente(ActionEvent event) throws IOException{
        Stage stage = new Stage();
        new DesafioProjeto3().start(stage);
    }    
    
     @FXML
    void cancelarJanela(ActionEvent event) {
        this.botaoCancel.getScene().getWindow().hide();
    }
}
