/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package desafioprojeto2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

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
    
}
